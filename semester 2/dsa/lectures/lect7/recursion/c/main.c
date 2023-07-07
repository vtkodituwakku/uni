#include <stdio.h>
#include <stdlib.h>

long double factorial(int n) {
  if (n == 1) {
    return 1;
  }

  if (n == 0) {
    return 1;
  }

  if (n < 1) {
    return -1;
  }

  return n * factorial(n - 1);
}

int main() { printf("%.0Lf\n", factorial(10)); }
