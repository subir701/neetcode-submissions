class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backTracking(nums,0,ans,temp);
        return ans;
    }

    public void backTracking(int[] nums, int i, List<List<Integer>> ans, List<Integer> temp){

        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        backTracking(nums, i+1, ans, temp);
        temp.add(nums[i]);
        backTracking(nums, i+1, ans, temp);
        temp.remove(temp.size()-1);
    }
}
