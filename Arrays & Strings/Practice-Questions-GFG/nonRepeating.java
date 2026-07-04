public class nonRepeating {
    static char nonRepeatingChar(String s) {
        int[] freq= new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
            freq[s.charAt(i)-'a']++;
        }
    }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        }
        return '$';
        }
        public static void main(String[] args) {
            String s="geek for geeks";
            System.out.println("The non repeating character is"+nonRepeatingChar(s));
        }
    }

