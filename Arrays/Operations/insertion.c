#include <stdio.h>

int main() {

    int arr[100] = {10, 20, 30, 40};
    int n = 4;

    int position = 2;
    int value = 25;

    // Shift elements to the right
    for (int i = n; i > position; i--) {
        arr[i] = arr[i - 1];
    }

    arr[position] = value;
    n++;

    printf("Array after insertion:\n");

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}