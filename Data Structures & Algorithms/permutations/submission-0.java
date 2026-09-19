class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(nums, 0, ans);
        return ans;
    }

    public void backTrack(int[] nums, int i, List<List<Integer>> ans){
        if(i == nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int n: nums){
                perm.add(n);
            }
            ans.add(perm);
            return;
        }

        for(int j = i; j < nums.length; j++){
            swap(nums,i,j);
            backTrack(nums,i+1,ans);
            swap(nums,i,j);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
