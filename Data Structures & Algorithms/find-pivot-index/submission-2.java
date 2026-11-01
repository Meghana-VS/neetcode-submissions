class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;

        for(int num : nums) { 
            totalSum += num;
        }
        for(int i=0; i<n; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}