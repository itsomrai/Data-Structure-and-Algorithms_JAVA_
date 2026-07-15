
public class removeElement {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
            
        }
        for(int i=0;i<index;i++){
            System.out.println(nums[i]);
        }
        
    }
    }

