public class arraySearch {

    public static int Arraysearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9,0};
        int target=7;
        int result=Arraysearch(number, target);
        System.out.println("Element found at index"+result);
    }
}

