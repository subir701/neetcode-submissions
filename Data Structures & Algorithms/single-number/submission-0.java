class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n: nums){
            res ^= n;
            System.out.println(res);
        }

        return res;
    }
}
