class closestPair{
    public static void main(String[] args) {
       int arr[] = {2, 3, 5};
        int x = 4;
        int temp1 = 0;
        int temp2  = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
            int diff = sum-x;
            if(diff <= x){
         temp1= arr[i];
         temp2= arr[j];
         diff = x;
            }
        
            System.out.println(diff);
            
    }
        }
}
}