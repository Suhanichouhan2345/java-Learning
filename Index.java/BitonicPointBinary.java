public class BitonicPointBinary {
    public static void main(String[] args) {

        int arr[] = {0, 2, 3, 4, 5, 3, 2, 1};
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
         int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == n - 1 || arr[mid] > arr[mid + 1])) {

                System.out.println("Bitonic Peak: " + arr[mid]);
                break;
            }
            else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}