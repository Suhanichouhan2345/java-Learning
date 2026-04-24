public class index {

    static int BinarySearch(int A[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (A[mid] == target) {
            return mid;
        } else if (A[mid] < target) {
            return BinarySearch(A, mid + 1, high, target);
        } else {
            return BinarySearch(A, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int result = BinarySearch(A, 0, A.length - 1, target);
        System.out.println(result);
    }
}