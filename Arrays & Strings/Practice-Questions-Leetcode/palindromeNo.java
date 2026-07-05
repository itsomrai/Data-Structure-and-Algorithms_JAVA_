
public class palindromeNo {
    public static void main(String[] args) {
        int x=121;
        int rev=0;
        int num=x;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev==x){
            System.out.println("TRUE, "+x+" IS A PALINDROME NO.");
        }
        else{
            System.out.println("FALSE");
        }
    }
    
}
