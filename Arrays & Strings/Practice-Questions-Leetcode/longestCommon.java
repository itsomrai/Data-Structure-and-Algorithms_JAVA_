import java.util.Arrays;

public class longestCommon {
    public static void main(String[] args) {
     String[] s={"flower","float","flight"};
     String result=longestCommonPre(s);
     System.out.println(result);

    }
    public static String longestCommonPre(String[] s){
        if(s==null || s.length==0) return "";
        Arrays.sort(s);
        String left=s[0];
        String right=s[s.length-1];
        int i=0;
        while(i<left.length() && i<right.length()){
            if(left.charAt(i)==right.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return left.substring(0,i);
    }
}

