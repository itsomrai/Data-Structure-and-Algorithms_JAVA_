 public class maximumProdu {
    public static void main(String[] args) {
        int n=23;
        String numStr = String.valueOf(n);
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }

        System.out.println(max1 * max2);
    }
}
