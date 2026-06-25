import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        int[] inc = new int[n], dec = new int[n];
        inc[0] = 1; dec[n-1] = 1;

        // Left se increasing length
        for(int i = 1; i < n; i++)
            inc[i] = a[i] >= a[i-1]? inc[i-1] + 1 : 1;

        // Right se decreasing length
        for(int i = n-2; i >= 0; i--)
            dec[i] = a[i] >= a[i+1]? dec[i+1] + 1 : 1;

        int ans = 0;
        for(int i = 0; i < n; i++)
            ans = Math.max(ans, inc[i] + dec[i] - 1);

        System.out.print(ans);
    }
}