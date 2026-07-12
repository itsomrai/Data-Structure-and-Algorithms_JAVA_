public class missingNum {
    public static void main(String[] args) {
        int[] nums={1,0,3};
                int xor1=0,xor2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor1=xor1^nums[i];
            xor2=xor2^i;
            }
            xor2^=n;
            int res=xor1^xor2;
            System.out.println(res);
    }
}
