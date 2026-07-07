public class countSpecial {
    public static void main(String[] args) {
        String word="AaBbCc";
        boolean[] lower=new boolean[26];
        boolean[] upper=new boolean[26];

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c>='a'&& c<='z'){
                lower[c-'a']=true;
            }
            else{
                upper[c-'A']=true;
            }
        }
        int ans=0;

        for(int i=0;i<26;i++){
            if(lower[i]&&upper[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
