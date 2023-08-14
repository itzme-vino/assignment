class Solution {
    boolean find(int size , int[] nums, int target)
    {
        int sum = 0;
        int i=0;
        int j=0;
        int max= Integer.MIN_VALUE;
        int n=nums.length;
        while(j<n){
            sum+=nums[j];
            if(j-i+1==size){
              max= Math.max(sum,max);
              sum-=nums[i];
              i++;
            }
            j++;
        }
        if(max>=target)
            return true;
        return false;
    
    }
    public int minSubArrayLen(int target, int[] nums) {
        int low = 1, high = nums.length, mn = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (find(mid, nums, target)) {
                high = mid-1;
                mn = mid;
            } else low = mid + 1;
        }
        return mn;
        
    }
}