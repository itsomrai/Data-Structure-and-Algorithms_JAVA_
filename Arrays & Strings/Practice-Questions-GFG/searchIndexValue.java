public class searchIndexValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,4,8,6,7};
        int key=7;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                ans=i;
            }
            else{
                ans=-1;
            }
            }
            System.out.println(ans);
        }
    }
