import java .util.Arrays;
public class removeElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,2,4};
        int val=2;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        System.out.println(index);
    }

    }

