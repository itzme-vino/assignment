class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        power(nums,0,subset,ans);
        return ans;
    }
    public void power(int []nums,int i,ArrayList<Integer> subset,         List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        power(nums,i+1,subset,ans);
        subset.remove(subset.size()-1);
        power(nums,i+1,subset,ans);
        
    }
}