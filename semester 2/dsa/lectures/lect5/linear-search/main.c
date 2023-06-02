#include <stdio.h>

typedef struct {
  int pos;
  int found;
} Result;

Result linear_search(int list[], int sk) {
  int found = 0;
  int pos = -1;
  if (sizeof(list[0]) <= 0) {
    Result result;
    result.pos = pos;
    result.found = found;

    return result;
  }

  int len = sizeof(list) / sizeof(list[0]);

  for (int i = 0; i < len; i++) {
    pos++;
    if (list[i] == sk) {
      found = 1;
      break;
    }
  }

  Result result;
  result.pos = pos;
  result.found = found;

  return result;
}

int main() {}
