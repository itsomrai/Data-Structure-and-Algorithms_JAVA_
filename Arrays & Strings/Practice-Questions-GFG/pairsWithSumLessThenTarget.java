import java.util.Arrays;

public class pairsWithSumLessThenTarget {
    public static void main(String[] args) {
        int[] arr={7, 2, 5, 3};
        Arrays.sort(arr);
        int target=8;
        int count=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[right]+arr[left] < target){
                count+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(count);
    }
}
