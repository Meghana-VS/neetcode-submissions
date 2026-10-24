class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max_so_far = -1;
        for(int i=n-1; i>=0; i--){
            int temp = arr[i]; 
            arr[i] = max_so_far;
            max_so_far = Math.max(max_so_far, temp);
        }
        return arr;
    }
}