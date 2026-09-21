#include <stdio.h>

int main() {

    int arr[] = {10, 20, 30, 40, 50};
    int n = 5;
    int k = 2;

    for (int rotation = 1; rotation <= k; rotation++) {

        int first = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first;
    }

    printf("Array after rotation:\n");

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}