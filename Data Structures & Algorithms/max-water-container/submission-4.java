class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(heights[i] > heights[j]) {
                int width = j - i;
                int area = width * heights[j];
                maxArea = Math.max(area, maxArea);
                j--;
            }    
            else if(heights[i] < heights[j]) {
                int width = j - i;
                int area = width * heights[i];
                maxArea = Math.max(area, maxArea);
                i++;
            }else {
                int width = j - i;
                int area = width * heights[i];
                maxArea = Math.max(area, maxArea);
                j--;
            }  
        }
        return maxArea;
    }
}
