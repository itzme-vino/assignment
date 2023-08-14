class Solution {
    public int findPeakElement(int[] nums) {
       int x = 0;
        int y = nums.length -1;

        while(x < y){
            int mid = x + (y - x) / 2;

            if(nums[mid] >nums[mid + 1]){
                y = mid;
            }
            else{
                x = mid + 1;
            }
        }
        return x;
        
    }
}