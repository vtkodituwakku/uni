#include <stdio.h>
#define MAX_SIZE 5

typedef struct {
  int top;
  int arr[MAX_SIZE];
} Stack;

void init(Stack *st) { st->top = -1; }

int isEmpty(Stack *st) { return st->top == -1; }

int isFull(Stack *st) { return st->top == MAX_SIZE - 1; }

void push(Stack *st, int value) {
  if (isFull(st)) {
    printf("Stack is full\n");
    return;
  }

  int top = ++st->top;
  st->arr[top] = value;
}

int pop(Stack *st) {
  if (isEmpty(st)) {
    printf("Stack is empty\n");
    return -1;
  }

  int value = st->arr[st->top];
  --st->top;
  return value;
}

void display(Stack *st) {
  if (isEmpty(st)) {
    printf("[]");
    return;
  }

  printf("[");
  for (int i = 0; i <= st->top; i++) {
    if (i == st->top) {
      printf("%d", st->arr[i]);
      continue;
    }

    printf("%d, ", st->arr[i]);
  }
  printf("]\n");
}

int main() {
  Stack s1;
  Stack s2;
  init(&s1);
  init(&s2);

  push(&s1, 10);
  push(&s1, 20);
  push(&s1, 30);

  push(&s2, 10);
  push(&s2, 20);
  push(&s2, 30);

  display(&s1);
  display(&s2);
}
