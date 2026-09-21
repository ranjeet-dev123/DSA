#include <stdio.h>

int main() {

    int arr[] = {10, 25, 7, 40, 15};
    int n = 5;

    int maximum = arr[0];

    for (int i = 1; i < n; i++) {

        if (arr[i] > maximum) {
            maximum = arr[i];
        }
    }

    printf("Maximum element = %d\n", maximum);

    return 0;
}