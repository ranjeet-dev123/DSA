#include <stdio.h>

int main() {

    int arr[] = {2, 1, 5, 1, 3, 2};
    int n = 6;
    int k = 3;

    int windowSum = 0;

    // Calculate first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }

    int maxSum = windowSum;

    // Slide the window
    for (int i = k; i < n; i++) {

        windowSum = windowSum + arr[i] - arr[i - k];

        if (windowSum > maxSum) {
            maxSum = windowSum;
        }
    }

    printf("Maximum window sum = %d\n", maxSum);

    return 0;
}