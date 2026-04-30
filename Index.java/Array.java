public class Array {
public static void main(String[] args) {
  int[] arr = {1,2,3,4,5,6,7};
     int k =2;
    int n = arr.length;
    int temp[] = new int[n];
    for(int i =0; i<arr.length; i++){
        for(int j = k; j<=i; j++) {
          //System.out.print(arr[i]);
            temp[i] = arr[j];  
        }
        System.out.print(temp[i]+ " ");
      }

   }
}



