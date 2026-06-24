public class linearSearching {

    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
}
return -1;
    }
    public static void main(String[] args) {
        int[] numbers={5,4,3,6,7,8};
        int target=3;
        int result= linearSearch(numbers, target);
        System.out.println("Element found at index:" + result);
    }
}
