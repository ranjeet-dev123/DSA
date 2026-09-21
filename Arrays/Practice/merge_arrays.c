#include <stdio.h>

int main() {

    int arr1[] = {10, 20, 30};
    int arr2[] = {40, 50, 60};

    int n1 = 3;
    int n2 = 3;

    int merged[6];

    // Copy first array
    for (int i = 0; i < n1; i++) {
        merged[i] = arr1[i];
    }

    // Copy second array
    for (int i = 0; i < n2; i++) {
        merged[n1 + i] = arr2[i];
    }

    printf("Merged array:\n");

    for (int i = 0; i < n1 + n2; i++) {
        printf("%d ", merged[i]);
    }

    return 0;
}