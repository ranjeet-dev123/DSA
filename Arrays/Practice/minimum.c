#include <stdio.h>

int main() {

    int arr[] = {10, 25, 7, 40, 15};
    int n = 5;

    int minimum = arr[0];

    for (int i = 1; i < n; i++) {

        if (arr[i] < minimum) {
            minimum = arr[i];
        }
    }

    printf("Minimum element = %d\n", minimum);

    return 0;
}