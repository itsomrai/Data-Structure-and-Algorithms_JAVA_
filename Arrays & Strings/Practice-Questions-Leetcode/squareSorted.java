import java.util.Arrays;

public class squareSorted {
    public static void main(String[] args) {
        int[] nums={1,3,2,4,5,10};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
