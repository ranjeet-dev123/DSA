#include <stdio.h>

int main() {

    int arr[] = {1, 2, 3, 4, 6, 8};
    int n = 6;

    int target = 10;

    int left = 0;
    int right = n - 1;

    while (left < right) {

        int sum = arr[left] + arr[right];

        if (sum == target) {
            printf("Pair found: %d + %d = %d\n",
                   arr[left], arr[right], target);
            return 0;
        }

        if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    printf("Pair not found\n");

    return 0;
}