public class movesame {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,3,9,7,8,6,9,9,9,9,0,0,0};
        for(int i =0; i<arr.length; i++){
            boolean isdublicate = false;
          for(int j =0; j<i; j++){
            if(arr[i] == arr[j]){
           isdublicate = true;
            }
          }
        if(isdublicate == false){
            System.out.print(arr[i]+" ");
        }
        }
    }
}
