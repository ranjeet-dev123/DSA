package Operations;
public class insertion {

    public static void main(String[] args) {

        int[] arr = new int[100];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;

        int position = 2;
        int value = 25;

        // Shift elements to the right
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
        n++;

        System.out.println("Array after insertion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}