public class countAlloccurence {
    public static void main(String[] args) {
        String s="geek for geeks";
        int k=1;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(current>='a' && current<='z'){
        if(i==0 || current!=s.charAt(i-1)){
            freq[current-'a']++;
        }
    }
    }
    int ans=0;
    for(int count: freq){
        if(count==k){
            ans++;
        }
    }
    System.out.println(ans);
    }
}

