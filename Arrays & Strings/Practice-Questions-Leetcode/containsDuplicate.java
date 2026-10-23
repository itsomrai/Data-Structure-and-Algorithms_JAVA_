import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,3};
        Arrays.sort(arr);
        boolean found=true;
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.println("Element is duplicate at"+i);
                System.out.println("Element is "+arr[i]);
                found=true;
         }
         }
         if (!found) {
            System.out.println("No duplicate");
         }
        }
      }

