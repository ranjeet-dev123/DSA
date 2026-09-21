package Practice;
public class move_zeroes {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int position = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        // Fill remaining positions with zero
        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}