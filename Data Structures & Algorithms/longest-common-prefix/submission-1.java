class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reference = strs[0];

        for (int i = 0; i < reference.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() ||
                    reference.charAt(i) != strs[j].charAt(i)) {
                    return reference.substring(0, i);
                }
            }
        }

        return reference;
    }
}