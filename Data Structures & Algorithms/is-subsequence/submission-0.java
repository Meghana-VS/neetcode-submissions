class Solution {
    public boolean isSubsequence(String s, String t) {
        // char[] s1 = s.toCharArray();
        // char[] t1 = s.toCharArray();
        int lastMatchIndex = -1;

        for(int i=0; i<s.length(); i++){
            char targetChar = s.charAt(i);
            boolean found = false;
            for(int j=lastMatchIndex + 1; j<t.length(); j++){
                if(targetChar == t.charAt(j)) {
                    lastMatchIndex = j;
                    found = true;
                    break;
                }
            }
            if(found == false) return false;
        }
        return true;
    }
}