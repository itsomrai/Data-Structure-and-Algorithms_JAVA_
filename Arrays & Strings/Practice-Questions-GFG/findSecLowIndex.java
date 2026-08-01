public class findSecLowIndex {
    public static void main(String[] args) {
        int[] citations={0,2,3,1,5};
        int n=citations.length;
        int i=0;
        while(i<n && citations[n-1-i]>i){
            i++;
        }
        System.out.println(i);
    }
}
