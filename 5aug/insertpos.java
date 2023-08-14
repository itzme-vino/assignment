class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid =-1;
        int ans =0;
        while(l<=r)
        {
            mid = l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                r = mid-1;
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return l;
        
    }
}