class Solution {
    public boolean isSubsequence(String s, String t) {
        // char[] s1 = s.toCharArray();
        // char[] t1 = s.toCharArray();
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i == s.length()) return true;
        return false;
    }
}