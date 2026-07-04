public class removeSpaces {
    public static void main(String[] args) {
        String s="geek for geeks";
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                result+=s.charAt(i);
            }
        }
        System.out.println("STRING WITHOUT SPACES "+result);
    }
}
