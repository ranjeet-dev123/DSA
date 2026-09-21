package Techniques;
public class two_pointer {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8};

        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(
                    "Pair found: " + arr[left] + " + "
                    + arr[right] + " = " + target
                );
                return;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Pair not found");
    }
}