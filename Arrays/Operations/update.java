
package Operations;

public class update {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int newValue = 35;

        arr[index] = newValue;

        System.out.println("Array after update:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}