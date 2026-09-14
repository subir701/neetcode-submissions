class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int i = 0;
        int j = temp.length()-1;

        while(i < j){
            if(temp.charAt(i) != temp.charAt(j))return false;
            i++;
            j--;
        }

        return true;
    }
}
