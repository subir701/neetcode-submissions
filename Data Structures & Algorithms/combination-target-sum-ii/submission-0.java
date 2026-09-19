class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        backTrack(candidates, target, 0, ans, new ArrayList<>());

        return ans;
    }

    private void backTrack(int[] nums, int target, int start,
                           List<List<Integer>> ans,
                           List<Integer> temp) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate choices at the same level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Since sorted, no later number can work either
            if (nums[i] > target) {
                break;
            }

            temp.add(nums[i]);

            // i + 1 because each element can be used only once
            backTrack(nums, target - nums[i], i + 1, ans, temp);

            temp.remove(temp.size() - 1);
        }
    }
}
