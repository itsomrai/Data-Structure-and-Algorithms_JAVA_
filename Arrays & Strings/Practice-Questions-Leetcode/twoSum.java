import java .util.Arrays;
public class twoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int n=nums.length;
        int[] result=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
