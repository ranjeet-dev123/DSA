package Practice;
public class minimum {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 15};

        int minimum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("Minimum element = " + minimum);
    }
}