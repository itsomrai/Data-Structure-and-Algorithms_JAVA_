import java.util.Arrays;

public class RemoveDupli2 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println("AFTER REMOVING THE DUPLICATES... NOW THE LIST IS:"+Arrays.toString(nums)+" AND NOW TOTAL NO. OF ELEMENTS ARE:"+k);
    }
}
