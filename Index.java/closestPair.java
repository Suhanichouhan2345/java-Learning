class ClosestPair {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int x = 4;

        int closepair = Integer.MAX_VALUE;
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(x - sum) < Math.abs(x - closepair)) {
                    closepair = sum;
                    temp1 = arr[i];
                    temp2 = arr[j];
                }
            }
        }
        System.out.println(closepair);
    }
}