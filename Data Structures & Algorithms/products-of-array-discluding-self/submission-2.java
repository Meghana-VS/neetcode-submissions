class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd = new int[n];
        int[] rightProd = new int[n];
        for(int i=0; i<n; i++) {
            if(i == 0) {
                leftProd[i] = 1;
            } else{
                leftProd[i] = leftProd[i-1] * nums[i-1];
            }
        }
        for(int i=n-1; i>=0; i--) {
            if(i == n-1) {
                rightProd[i] = 1;
            } else{
                rightProd[i] = rightProd[i+1] * nums[i+1];
            }
        }
        for(int i=0; i<n; i++) {
            nums[i] = leftProd[i] * rightProd[i];
        }
        return nums;
    }
}  
