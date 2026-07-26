import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits={1,2,3};
                for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}
