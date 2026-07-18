
import java.util.Arrays;

public class reverseArray {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6 };
        reverse(num);
        System.out.println(Arrays.toString(num));// Array.toString is used to get output in brackets
    }
}
