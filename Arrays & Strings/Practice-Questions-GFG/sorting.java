import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr={1,2,1,0,2,0};
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
