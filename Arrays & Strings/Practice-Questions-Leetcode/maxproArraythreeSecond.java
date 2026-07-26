import java.util.Arrays;

public class maxproArraythreeSecond {
    public static void main(String[] args) {
        int[] n={-1,-2,-3};
        Arrays.sort(n);
        int l=n.length;
        int res1=n[l-1]*n[l-2]*n[l-3];
        int res2=n[0]*n[1]*n[l-1];
        int max=Math.max(res1, res2);
        System.out.println(max);
    }
}
