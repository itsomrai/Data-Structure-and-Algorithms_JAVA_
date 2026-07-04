public class countWord {
    public static void main(String[] args) {
        String s="Geek for geeks";


        String[] words=s.trim().split("\\s+");
        int word=words.length;
        System.out.println(word);
    }
}

