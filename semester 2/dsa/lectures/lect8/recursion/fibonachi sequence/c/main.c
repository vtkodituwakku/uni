#include <stdio.h>
#include <stdlib.h>

void fibonachi(int n, int x, int y) {
  if (n < 3) {
    printf("\n");
    return;
  }

  if (x == 0 && y == 1) {
    printf("0, 1");
  }

  printf(", %d", x + y);
  return fibonachi(n - 1, y, x + y);
}

int main() { fibonachi(9, 0, 1); }
