package Practice;
public class maximum {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40,100, 15};

        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println("Maximum element = " + maximum);
    }
}