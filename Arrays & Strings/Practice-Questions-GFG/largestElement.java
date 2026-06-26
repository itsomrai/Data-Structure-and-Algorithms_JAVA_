import java .util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+ "elements:" );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int maxElement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        System.out.println("The Largest element is: "+maxElement);
        sc.close();
    }
}

