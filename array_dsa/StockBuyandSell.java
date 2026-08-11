package array_dsa;

public class StockBuyandSell {
    public static int buyandsell(int arr[]){
        int profit = 0;
        int BProfit = arr[0];
        for(int i=0;i<arr.length;i++){
            if(BProfit>arr[i])
                BProfit = arr[i];
             profit=Math.max(profit,arr[i]-BProfit);
        }
        return profit;

    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int profit = buyandsell(arr);
        System.out.println(profit);
    }
    
}
