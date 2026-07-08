public class PivotIndex {
public static int pivotIndex(int[] nums){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftTotalSum=0;
        for(int i=0;i<nums.length;i++){
            int righttotal=total-leftTotalSum-nums[i];
            if(righttotal==leftTotalSum){
                return i;
            }
            leftTotalSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}

