class Solution {
    List<List<Integer>> ans =  new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums,0, new ArrayList<>());
        return ans;
    }

    public void backTrack(int[] nums, int i, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j - 1]){
                continue;
            }
            temp.add(nums[j]);
            backTrack(nums, j + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
