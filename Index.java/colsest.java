public class colsest {
    public static void main(String[] args) {
       int arr[] = {10,15,28,39,40,49};
       int arr1[] = {4,7,10,20,29};
       int x = 43;
       int first = 0;
       int second = 0;
       int Diff = Integer.MAX_VALUE;
       for(int i =0; i<arr.length; i++){
        for (int j =0; j<arr1.length; j++){
       int sum = arr[i] + arr1[j];
             int cur = Math.abs(sum - x); 
                if(cur< Diff) { 
                    Diff = cur;
                    first = arr[i];
                    second = arr1[j];
                }
        }   
       
    }
    int closets = first + second;
      System.out.println(closets);
        System.out.println( + first + " + " + second);
    }
}
