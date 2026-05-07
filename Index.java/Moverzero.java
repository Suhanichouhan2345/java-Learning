public class Moverzero {
    public static void main(String[] args) {
        int arr [] = {1,2,3,45,5,0,0,7,5,0};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int temp[] = new int[n];
        for(int i =0; i<arr.length; i++){
            int a = arr[i];
            
            if(a!=0){
            temp[left] = arr[i];
              left++;
        } else{
             temp[right] = arr[i];
              right--;
        }
    }
           for(int i =0; i<n; i++){
            System.out.print(temp[i] + " ");
           }
    }
}

