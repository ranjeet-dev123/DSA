package Practice;
public class rotate_array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int k = 2;

        for (int rotation = 1; rotation <= k; rotation++) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        System.out.println("Array after rotation:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}