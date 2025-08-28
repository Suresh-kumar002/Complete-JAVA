public class Time_Buy_Sell_Stock {
    public static int TBSS(int prices[]){ //time com-->o(n)
        int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){//profit
            if (buyprices<prices[i]) {
                int profit=prices[i]-buyprices; //today profit
                maxprofit=Math.max(maxprofit, profit);              
            }else{
                buyprices=prices[i];
            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(TBSS(prices));
    }

}
