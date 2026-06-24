import java .util .*;
public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String arr=sc.nextLine();

        int count=0; 
        String lowerinput= arr.toLowerCase();

        for(int i=0;i<lowerinput.length();i++){
            char ch=lowerinput.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Total number of vowels : " + count);

        sc.close();
    }
}
