public class stringsLastWordLength {
    public static void main(String[] args) {
        String s="Hello My NAme Is OM";
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else if(length>0){
                break;
            }
        }
        System.out.println(length);
    }
}


