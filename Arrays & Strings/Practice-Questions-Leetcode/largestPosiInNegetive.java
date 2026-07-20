import java.util.Arrays;

public class largestPosiInNegetive {
    public static void main(String[] args) {
        int [] nums={1,2,-2,4,-4,-6,5,-5};
        Arrays.sort(nums);
        int j=nums.length-1,i=0;
        while(i<j){
            int a=-1*nums[j];
            if(nums[i]==a){
                System.out.println(nums[j]);
                return;
            }
            else if(nums[i]<a){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("-1");
    }
}
