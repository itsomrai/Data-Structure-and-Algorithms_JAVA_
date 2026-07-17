public class singleNumber {

    public static void main(String[] args) {
        int[] nums={1,1,2,3,2};
        int res=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            res^=n;
        }
        System.out.println(res);
    }
}