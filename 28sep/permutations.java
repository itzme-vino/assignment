class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList(), nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int[]nums)
    {
        if(nums.length==temp.size())
        {
            result.add(new ArrayList(temp));
            return;
        }
        for(int number: nums)
        {
            if(temp.contains(number))
            continue;
            temp.add(number);
            backtrack(result, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}