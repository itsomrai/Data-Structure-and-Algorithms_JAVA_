public class FirstOccurence {
    public static void main(String[] args) {
        String h="sadbutsad";
        String n="sad";
        for(int i=0;i<h.length()-n.length()+1;i++){
            if(h.charAt(i)==n.charAt(0)){
                if(h.substring(i,n.length()+i).equals(n)){
                    System.out.println(i);
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }
}
