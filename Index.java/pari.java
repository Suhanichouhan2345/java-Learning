
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      int[][] matrix = new int[3][3];
      int a =Integer.MAX_VALUE;
      Scanner sc= new Scanner(System.in);
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              if(i==2&&j==1){
                  matrix[i][j]=a;
                  continue;
              }
              matrix[i][j]= sc.nextInt();
              
          }
      }
      
      for(int k=1,k<=n;k++){
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  
              }
          }
      }
      
      
    }
}