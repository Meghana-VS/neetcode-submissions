class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int i = 0;
        int j = n-1;
        while(i < j) {
            int width = j - i;
            int area = width * Math.min(heights[i], heights[j]);
            maxArea = Math.max(area, maxArea);
            if(heights[i] > heights[j]) j--; 
            else i++;
        }
        return maxArea;
    }
}
