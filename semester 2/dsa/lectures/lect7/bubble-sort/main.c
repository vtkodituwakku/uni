#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#define getLength(array) (sizeof(array) / sizeof(array[0]))

void display(int arr[], int len) {
  printf("[");
  for (int i = 0; i < len; i++) {
    if (i == len - 1) {
      printf("%d", arr[i]);
      continue;
    }
    printf("%d, ", arr[i]);
  }
  printf("]\n");
}

void bubble_sort(int arr[], int len) {
  for (int i = 0; i < len; i++) {
    for (int j = 0; j < len - 1 - i; j++) {
      if (arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}

int main() {
  int arr[] = {5, 4, 2, 6, 7};
  int len = getLength(arr);

  bubble_sort(arr, len);
  display(arr, len);
}
