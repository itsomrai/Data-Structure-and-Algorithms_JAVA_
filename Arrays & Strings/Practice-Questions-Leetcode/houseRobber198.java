import java.util.Scanner;

public class houseRobber198 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            int maxSum = Math.max(sum1, sum2 + nums[i]);

            sum2 = sum1;
            sum1 = maxSum;
            }
        
    System.out.println(sum1);
    sc.close();
    }
}

