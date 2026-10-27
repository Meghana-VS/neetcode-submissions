class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortestLen = Integer.MAX_VALUE;
        for(String str : strs) {
            shortestLen = Math.min(shortestLen, str.length());
        }

        String reference = strs[0];
        for(int i=0; i<shortestLen; i++){ 
            for(int j=0; j<strs.length; j++){
                if(reference.charAt(i) != strs[j].charAt(i)) {
                    return reference.substring(0, i);
                }
            }
        }
        return reference.substring(0, shortestLen);
    }
}