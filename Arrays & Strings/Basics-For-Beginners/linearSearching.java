public class linearSearching {

    public static int linearsearch(int[] arr , int target){
        for(int i=0; i<=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number={5,6,7,8,3,4};
            int target=4;
            int result= linearsearch(number, target);
            System.out.println("Element found at index:" + result);
        }
    }

