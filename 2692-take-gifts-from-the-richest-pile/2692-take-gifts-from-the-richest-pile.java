class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        long rem = 0;
        int n = gifts.length;
        while(k>0){
          Arrays.sort(gifts);
          gifts[n-1] = (int) Math.sqrt((double) gifts[n-1]);
          k--;
          
        }
        for(int i=0;i<n;i++){
          rem+=gifts[i];
        }   
        return rem;
        
    }
}