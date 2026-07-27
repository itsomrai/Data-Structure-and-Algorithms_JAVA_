public class maxTwoProd {
    public static void main(String[] args) {
        int[] nums={3,4,5,7,8};
        int n=nums.length;
        int res=(nums[n-1]-1)*(nums[n-2]-1);
        System.out.println(res);
    }
}
