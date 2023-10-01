class Solution {
    public List<List<Integer>> sol = new ArrayList<>();

    public void backtrack(int[] nums, List<Integer> temp, int t){
        sol.add(new ArrayList<>(temp));
        for(int i=t;i<nums.length;i++){
            if(i > t && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(nums,temp,i+1);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>>subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,temp,0);
        return sol;
    }
}