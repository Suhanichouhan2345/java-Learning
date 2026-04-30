public class evNumber {
    public static void main(String[] args) {
        int num = 12345;
        int revser = 0;
        for (int i = num; i != 0; i /= 10) {
            int digit = i % 10;
            revser = revser * 10 + digit;
        }

        System.out.println(revser);
    }
}
