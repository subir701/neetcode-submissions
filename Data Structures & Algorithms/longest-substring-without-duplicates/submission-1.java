class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        int max = 0;

        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                max = Math.max(max, i - j);
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }

        max = Math.max(max, set.size());
        return max;
    }
}
