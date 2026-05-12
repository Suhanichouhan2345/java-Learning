public class product {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int temp [] = new int[n];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = num; j < arr.length; j++) {
        temp[i] = num*arr[j];
            }
            System.out.print(temp[i] + " ");
        }
    }
}
