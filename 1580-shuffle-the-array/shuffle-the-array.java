class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int arr [] = new int [2*n];
        int j = n;
        int start=0;
        for(int i=0;i <2*n ;i+=2){
            arr[i] = nums[start];
            arr[i+1]= nums[j];

            start++;
            j++;
        }
        return arr;
    }
}