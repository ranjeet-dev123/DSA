#include <stdio.h>

int main() {

    int arr[] = {10, 10, 20, 20, 30, 30};
    int n = 6;

    int newSize = 1;

    for (int i = 1; i < n; i++) {

        if (arr[i] != arr[newSize - 1]) {
            arr[newSize] = arr[i];
            newSize++;
        }
    }

    printf("Array after removing duplicates:\n");

    for (int i = 0; i < newSize; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}