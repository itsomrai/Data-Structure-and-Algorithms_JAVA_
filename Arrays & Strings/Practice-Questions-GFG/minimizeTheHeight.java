import java.util.Arrays;

public class minimizeTheHeight {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,3,6};
        int k=2;
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];

        // For all indices i, increment arr[0...i-1] by k and
        // decrement arr[i...n-1] by k
        for (int i = 1; i < arr.length; i++) {

            // Impossible to decrement height of ith tower by k, continue
            if (arr[i] - k < 0) continue;

            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            res = Math.min(res, maxH - minH);
        }
        System.out.println(res);
    }
}
