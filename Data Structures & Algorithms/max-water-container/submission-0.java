class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max = 0;

        while(left < right){
            int temp = Math.min(heights[left], heights[right]);
            int area = temp * (right - left);
            max = Math.max(area, max);

            if(heights[left] > heights[right])right--;
            else left++;
        }

        return max;
    }
}
