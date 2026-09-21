package Practice;
public class remove_duplicates {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 20, 30, 30};

        int newSize = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[newSize - 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}