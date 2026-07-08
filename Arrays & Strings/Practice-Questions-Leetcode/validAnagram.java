public class validAnagram {
    public boolean isAnagram(String s , String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        validAnagram sol= new validAnagram();
        System.out.println(sol.isAnagram("anagram","nagarao"));
    }
}
