public class numberOfOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,2,7,2,2};
        int target=2;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
