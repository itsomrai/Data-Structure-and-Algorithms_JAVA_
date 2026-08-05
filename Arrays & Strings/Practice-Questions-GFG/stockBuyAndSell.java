public class stockBuyAndSell {
    public static void main(String[] args) {
        int[] prices={1, 3, 6, 9, 11};
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        System.out.println(profit);
    }
}
