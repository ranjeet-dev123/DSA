public class binary {

    static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40,102,25,52,85,68,99,100,101,102,103,104,105,106,107,108,109,110};
        int target = 100;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } 
        else {
            System.out.println("Element not found in array");
        }
    }
}