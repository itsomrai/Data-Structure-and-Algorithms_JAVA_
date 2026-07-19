import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={4,6,5};
        int n=3;
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
            
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
