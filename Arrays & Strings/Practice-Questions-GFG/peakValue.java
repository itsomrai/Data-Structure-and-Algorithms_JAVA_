public class peakValue {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7, 8, 3};
        boolean foundPeak=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println("true");
                foundPeak=true;
                return;
            }

            }
            if(!foundPeak){
                System.out.println("false");
            }
        }
    }
