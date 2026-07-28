public class reverseStringII {
    public static void main(String[] args) {
        String s="HELLO";
        int k=2;
        String rev="";
        for(int i=k-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
