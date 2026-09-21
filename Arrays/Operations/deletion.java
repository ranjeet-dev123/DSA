package Operations;
public class deletion {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int n = arr.length;
        int position = 2;

        // Shift elements to the left
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.println("Array after deletion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}