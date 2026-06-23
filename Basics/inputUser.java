import java.util.Scanner;
public class inputUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your Age :");
        System.out.println("Input the name");
        int age=sc.nextInt();
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(age);

    }
}