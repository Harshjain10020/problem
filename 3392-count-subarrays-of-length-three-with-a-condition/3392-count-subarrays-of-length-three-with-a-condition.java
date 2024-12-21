class Solution {
    public int countSubarrays(int[] nums) {
        int ct = 0;
        for(int i = 0 ; i < nums.length-2 ; i++){
            int fst = nums[i];
            int mid = nums[i + 1];
            int thrd = nums[i + 2];
            
            if (fst + thrd == mid /2.0) { 
                ct++;
            }
        }
        return ct;
        
    }
}