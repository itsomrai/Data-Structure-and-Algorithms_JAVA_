public class sumQuerry {
    public static int sumRange(int[] nums,int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=nums[i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={3,5,-2,8,1,4};
        int result=sumRange(nums, 1, 3);
        System.out.println("the range sum is:"+result);
    }
}
