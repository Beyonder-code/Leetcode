class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int right =-1;
        int nums [] =new int [n];
        for(int i=n-1; i>=0; i--){
            nums[i]=right;
         right=Math.max(right,arr[i]);
        }
        return nums;
    }
}