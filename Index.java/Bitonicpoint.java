public class Bitonicpoint {
    public static void main(String[] args) {
     int arr[] = {6,2,3,4,4,3,2,1};
     int temp = arr[0];
     for(int i = 0; i < arr.length; i++){
   if(arr[1] < temp){
     temp = arr[i] ;
     System.out.println(temp + " first");
   } 
}
   System.out.println(temp);
      
    }
}
