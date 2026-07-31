import java.util.Arrays;

public class heightChecker {
    public static void main(String[] args) {
        int[] height={1,1,4,2,1,3};
        int count=0;
        int[] expected=height.clone();
        Arrays.sort(expected);
        for(int i=0;i<height.length;i++){
            if(height[i]!=expected[i]){
                count++;
            }
        }
        System.out.println("COUNT HEIGHT IS NOT MATCHING="+count);
    }
}
