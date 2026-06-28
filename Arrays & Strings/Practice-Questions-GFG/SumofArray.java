import java.util.*;
public class SumofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println("THE ARRAY OF INDEX"+i+" = "+arr[i]);
        }
         System.out.println("THERE SUM ="+sum);
        sc.close();
    }
}
