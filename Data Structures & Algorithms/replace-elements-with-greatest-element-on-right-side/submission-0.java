class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int maxi = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                maxi = Math.max(maxi, arr[j]);
            }
            arr[i] = maxi;
        }
        arr[n-1] = -1;
        return arr;
    }
}