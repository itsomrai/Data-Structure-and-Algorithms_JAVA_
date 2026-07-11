import java.util.Arrays;
public class sortColor {
    public static void main(String[] args) {
        int[] nums={2,3,0,4,0,1,5};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
