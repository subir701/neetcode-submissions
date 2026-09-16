class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int n: piles){
            right = Math.max(right, n);
        }

        while(left < right){
            int k = left + (right - left) / 2;
            int hours = 0;

            for(int n: piles){
                hours += (n + k - 1)/k;
            }

            if(hours <= h){
                right = k;
            }else{
                left = k + 1;
            }
        }

        return left;
    }
}
