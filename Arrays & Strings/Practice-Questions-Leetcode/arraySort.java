import java .util.Arrays;
public class arraySort {
public static int[] sort(int[] nums){
        int[] count= new int[100001];
        int offset=50000;

        for(int num:nums){
            count[num+offset]++;
        }

        int index=0;
        for(int i=0; i<count.length;i++){
            while (count[i]>0) {
                nums[index++]=i-offset;
                count[i]--;
            }
        }
            return nums;
    
    }
    public static void main(String[] args) {
        int[] nums={5,2,1,3,2};
        int[] result=sort(nums);
        System.out.println(Arrays.toString(result));
    }
}
