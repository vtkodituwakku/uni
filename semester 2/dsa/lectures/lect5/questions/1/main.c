#include <stdio.h>

struct Queue {
  int qa[5];
  int front, rear;
} q;

void enqueue(int element) { q.qa[++q.rear] = element; }

int dequeue() { return q.qa[q.front++]; }

int main() {
  q.front = 0;
  q.rear = -1;

  enqueue(10);
  enqueue(20);
  enqueue(30);
  dequeue();
}
