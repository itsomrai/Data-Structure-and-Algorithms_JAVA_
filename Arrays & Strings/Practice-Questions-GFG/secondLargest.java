public class secondLargest {
    public static int findSecondLargest(int[] arr){
        if(arr==null || arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        return (secondLargest==Integer.MIN_VALUE)? -1 :secondLargest;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,23,32,45,56,21};
        System.out.println(("SECOND LARGEST :"+findSecondLargest(numbers)));
    }
}
