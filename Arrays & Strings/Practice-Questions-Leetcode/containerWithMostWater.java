import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water blocker heights");
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }

        System.out.println(res);
        sc.close();
    }
}

