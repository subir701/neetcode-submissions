class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];

        return Math.max(fun(nums,0,n-2), fun(nums,1, n - 1));
    }

    public int fun(int[] nums, int s, int e){
        int prev = 0;
        int max = 0;

        for(int i = s; i <= e; i++){
            int curr = Math.max(prev + nums[i], max);
            prev = max;
            max = curr;
        }

        return max;
    }
}
