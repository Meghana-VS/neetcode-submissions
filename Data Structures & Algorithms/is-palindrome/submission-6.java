class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String str = s.toLowerCase();
        while(left < right && right >= 0) {
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else{
                return false;
            }
        }
        return true;
    }
}
