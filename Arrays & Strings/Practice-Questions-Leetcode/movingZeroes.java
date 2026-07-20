import java.util.Arrays;

public class movingZeroes {
    public static void main(String[] args) {
        int[] nums={3,0,1,2,0,3,2};
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]= temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
