#include <stdio.h>
#include <limits.h>

int main() {

    int arr[] = {10, 40, 20, 50, 30};
    int n = 5;

    int largest = INT_MIN;
    int secondLargest = INT_MIN;

    for (int i = 0; i < n; i++) {

        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    printf("Largest = %d\n", largest);
    printf("Second Largest = %d\n", secondLargest);

    return 0;
}