#include <stdio.h>
#include <stdlib.h>

int gcf(int a, int b) {
  if (a < 0 || b < 0) {
    return -1;
  }

  if (a == 0) {
    return b;
  }

  if (b == 0) {
    return a;
  }

  if (a > b) {
    if (a % b == 0) {
      return b;
    } else {
      return gcf(b, a % b);
    }
  } else {
    if (b % a == 0) {
      return a;
    } else {
      return gcf(a, b % a);
    }
  }
}

int main() {
  int num1 = 0, num2 = 0;

  printf("The number 1 is : ");
  scanf("%d", &num1);

  printf("The number 2 is : ");
  scanf("%d", &num2);

  printf("The GCF of %d and %d is -> %d\n", num1, num2, gcf(num1, num2));
}
