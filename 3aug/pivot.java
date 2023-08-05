class Solution {
    public int pivotIndex(int[] nums) {
        int t = 0, lsum = 0;
        for (int x: nums) t += x;
        for (int i = 0; i < nums.length; ++i) {
            if (lsum == t - lsum - nums[i]) return i;
            lsum += nums[i];
        }
        return -1;
        
    }
}