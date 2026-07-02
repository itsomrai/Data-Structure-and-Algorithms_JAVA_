import java.util.*;
public class checkConsVowel {
    public static void main(String[] args) {
        int v=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    
        // code here
        for(int i=0 ;i<s.length() ;i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'u' ||
                s.charAt(i) == 'e' || s.charAt(i) == 'o')
                v++;
            
            else
                c++;
            
        }
        if(v>c)
           System.out.print("Yes"); 
        
        else if(c>v)
            System.out.print("No");
        
        else
            System.out.print("Same");
            
            System.out.println();
        
        sc.close();
    }

}

