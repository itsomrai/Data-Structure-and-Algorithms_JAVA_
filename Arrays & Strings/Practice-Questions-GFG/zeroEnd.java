import java.util.Arrays;

public class zeroEnd {
       public static void pushZerosToEnd(int[] arr) {
        // code here
        int nonZeroIndex=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[i];
                arr[i]=temp;
                
                nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,0,4};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
