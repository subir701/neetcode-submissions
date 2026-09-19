class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backTrack(nums, target, 0, temp, ans);
        return ans;
    }

    public void backTrack(int[] nums, int target, int i, List<Integer> temp, List<List<Integer>> ans){
        
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0 || i == nums.length){
            return;
        }

        temp.add(nums[i]);
        backTrack(nums,target - nums[i], i, temp,ans);
        temp.remove(temp.size() - 1);
        backTrack(nums,target, i + 1, temp, ans);
    }
}
