class Solution {
    public int[] productExceptSelf(int[] nums) {
int multi=1,zeros=0;
        for(int x=0;x<nums.length;x++){
            if(nums[x]==0){
                multi*=1;
                zeros+=1;
            }
            else{
                 multi*=nums[x];
            }
        }
        int arr[]=new int[nums.length];
        if(zeros>=2){
            return arr;
        }
        for(int x=0;x<arr.length;x++){
            if(nums[x]==0)
                arr[x]=multi;
            else{
                if(zeros>0)
                arr[x]=0;
                else
                arr[x]=multi/nums[x];
            }
        }
        return arr;
    }
}