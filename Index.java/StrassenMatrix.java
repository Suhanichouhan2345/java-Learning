import java.util.Scanner;
public class StrassenMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        int C[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }      
        if(n == 2) {
    
            int A11 = A[0][0];
            int A12 = A[0][1];
            int A21 = A[1][0];
            int A22 = A[1][1];
            int B11 = B[0][0];
            int B12 = B[0][1];
            int B21 = B[1][0];
            int B22 = B[1][1];

            
            int P = (A11 + A22) * (B11 + B22);
            int Q = (A21 + A22) * B11;
            int R = A11 * (B12 - B22);
            int S = A22 * (B21 - B11);
            int T = (A11 + A12) * B22;
            int U = (A21 - A11) * (B11 + B12);
            int V = (A12 - A22) * (B21 + B22);
            C[0][0] = P + S - T + V;
            C[0][1] = R + T;
            C[1][0] = Q + S;
            C[1][1] = P + R - Q + U;

        } 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

      
    }
}