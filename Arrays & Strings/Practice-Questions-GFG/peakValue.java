public class peakValue {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7, 8, 9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println("true");
                return;
            }
            else{
        System.out.println("false");
        return;

            }
        }
    }
}
