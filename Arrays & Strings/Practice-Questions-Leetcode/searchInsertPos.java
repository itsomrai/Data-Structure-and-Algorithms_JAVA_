public class searchInsertPos {
    public static void main(String[] args) {
        int[] nums={2,3,1,5,6};
        int target=5;
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(left);
    }
}
