#include <stdio.h>

int main() {

    int arr[] = {10, 20, 30, 40, 50};
    int n = 5;

    int index = 2;
    int newValue = 35;

    arr[index] = newValue;

    printf("Array after update:\n");

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}