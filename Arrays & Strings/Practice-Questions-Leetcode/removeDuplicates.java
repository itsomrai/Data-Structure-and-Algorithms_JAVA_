public class removeDuplicates {
    public static void main(String[] args) {
        int[] num={1,1,2,2,3,3,4,4,5,5};
        System.out.print(num[0]+" ");

        for(int i=1;i<num.length;i++){
            if(num[i]!=num[i-1]){
            System.out.print(num[i]+ " ");

            }
        }
    }
}
