import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        int n=arr.length;
        d=d%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[(i+d)%n];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
