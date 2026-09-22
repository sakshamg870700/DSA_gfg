class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        int n = prices.length;

        int buy =(n+k)/(k+1);
        int minCost=0;
        int maxCost=0;

        int i=0;
        while(i<buy){
            minCost+=prices[i];
            i++;
        }
        i=n-buy;
        while(i<n){
            maxCost+=prices[i];
            i++;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(minCost);
        ans.add(maxCost);
         return ans;



    }
}