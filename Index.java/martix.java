import java.util.Scanner;
public class martix {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter r1");
      int r1 = sc.nextInt();
        System.out.println("enter c2");
   int c1= sc.nextInt();
     System.out.println("enter r2");
  int r2 = sc.nextInt();
    System.out.println("enter c2");
  int c2 = sc.nextInt();
  int A [][]= new int [r1] [c1];
  int B [] [] = new int [r2] [c2];
  int C[] [] = new int[r1][c2];
  for(int i = 0; i< r1; i++){
    for(int j =0; j<c1; j++){
        A[i][j] = sc.nextInt();
    }
  }
    for(int i = 0; i< r2; i++){
    for(int j =0; j<c2; j++){
        B[i][j] = sc.nextInt();
    }
  }
    for(int i = 0; i< r1; i++){
    for(int j =0; j<c2; j++){
        C[i][j] = 0;
        for(int k =0; k<c1; k++){
            C[i][j] += A[i][k] * B[k][j];
        }
    }
}
    for(int i =0; i<r1; i++){
        for(int j =0; j<c2; j++){
            System.out.println(C[i][j] + " ");
        }
        System.out.println();
    }
  
    }
}