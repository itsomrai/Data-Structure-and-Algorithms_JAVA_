import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,3};
        Arrays.sort(arr);
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.print("Element is duplicate at\n"+i);
                System.out.print("Element is \n"+arr[i]);
         }
         else{