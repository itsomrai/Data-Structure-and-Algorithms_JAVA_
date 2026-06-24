public class transversingString {
    public static void main(String[] args) {
        String text="Hello";

        for(int i=0;i<text.length(); i++){
            char ch = text.charAt(i);
            System.out.println("Character at index" + i + ":" + ch);
        }
    }
}
