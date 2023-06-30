#include <stdio.h>
#include <stdlib.h>

// swap is a function that is used to swap to variables
#include <stdio.h>
void swap(int *x, int *y) {
  int temp = *x;
  *x = *y;
  *y = temp;
}

void selectionSort(int arr[]) {
  int len = sizeof(arr) / sizeof(arr[0]);
  int i = 0, j = 0, minIndex = 0;

  for (i = 0; i < len - 1; i++) {
    minIndex = i;
    for (j = i + 1; j < (len - (i + 1)); j++) {
      if (arr[minIndex] < arr[j]) {
        minIndex = arr[j];
      }

      if (minIndex != i) {
        swap(&arr[minIndex], &arr[i]);
      }
    }
  }

  for (int z = 0; z < len; z++) {
    if (z == 0) {
      printf("[ ");
      continue;
    }
    if (z == len - 1) {
      printf("%d ]", arr[z]);
      continue;
    }

    printf("%d, ", arr[z]);
  }
}

int main() {
  int arr[10] = {1, 9, 7, 3, 4, 5, 2, 8, 6};
  selectionSort(arr);
}
