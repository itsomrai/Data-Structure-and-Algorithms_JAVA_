import java.util.Arrays;

public class numSmaller {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] allNums=new int[101];
        int[] res= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            allNums[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            allNums[i]+=allNums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
                        }else{
                res[i]=allNums[nums[i]-1];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

