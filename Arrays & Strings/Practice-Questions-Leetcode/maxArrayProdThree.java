public class maxArrayProdThree {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
        }
        System.out.println(pro);
    }
}
