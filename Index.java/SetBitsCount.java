

public class SetBitsCount {
    public static void main(String[] args) {
    
        int n = 13;

        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }

        System.out.println("Number of set bits = " + count);
    }
}