public class kthBit {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        if ((n & (1 << k)) != 0) {
            System.out.println("SET");
        } else {
            System.out.println("NOT SET");
        }
    }
}