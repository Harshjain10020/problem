class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
     int[] answer = new int[n];
     if(n==1){ answer[0] = prices[0]; return answer;}
     for(int i =0; i<n-1; i++){
        answer[i] = ansElement(i, prices);
     }
     answer[n-1] = prices[n-1];
     return answer;
    }

    public int ansElement(int i, int[] prices){
        int ansEle = prices[i];
        for(int j = i+1; j<prices.length; j++){
            if(prices[j] <= prices[i]){
                ansEle -= prices[j];
                break;
            }
        }
        return ansEle;
    }
}