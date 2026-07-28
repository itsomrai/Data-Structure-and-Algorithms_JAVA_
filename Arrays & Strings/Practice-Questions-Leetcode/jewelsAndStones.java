public class jewelsAndStones {
    public static void main(String[] args) {
        String jewel="aBb";
        String stones="aaBBbbCC";
        int res=0;
        char[] a=jewel.toCharArray();
        char[] b=stones.toCharArray();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==b[i]){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
