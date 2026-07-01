public class checkArraySort {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,89};
        int n=arr.length;
        int a=0;
        int b=a;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                b=-1;
            }
            else{
                b=1;
            }
        }
        if(b==1){
            System.out.println("SORTED");
        }
        else{
            System.out.println("NOT");
        }
    }
    
}
