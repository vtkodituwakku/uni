#include <stdio.h>
#define MAX_SIZE 5

typedef struct {
  int front;
  int rear;
  int counter;
  int arr[MAX_SIZE];
} Queue;

void init(Queue *q) {
  q->front = 0;
  q->rear = -1;
}

int isEmpty(Queue *q) { return q->counter == 0; }
int isFull(Queue *q) { return q->counter == MAX_SIZE; }

void enQueue(Queue *q, int num) {
  if (isFull(q)) {
    printf("The queue is full");
    return;
  }
  q->counter++;

  if (q->rear == MAX_SIZE - 1) {
    q->rear = 0;
    q->arr[0] = num;
    return;
  }

  q->rear++;
  q->arr[q->rear] = num;
}

int deQueue(Queue *q) {
  if (isEmpty(q)) {
    printf("The queue is empty");
    return -1;
  }
  q->counter--;

  if (q->front == MAX_SIZE - 1) {
    int value = q->arr[q->front];
    q->front = 0;
    return value;
  }

  int value = q->arr[q->front];
  q->front++;
  return value;
}

int main() {
  Queue q1;
  init(&q1);
}
