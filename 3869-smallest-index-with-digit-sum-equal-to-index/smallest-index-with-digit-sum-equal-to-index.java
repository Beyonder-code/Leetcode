class Solution {
    public int digitSum (int a){
        int sum =0;
        while (a>0){
            int temp = a%10;
            sum += temp;
            a/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        
        int n = nums.length;
        int temp =0;
        for (int i =0; i<n; i++){
            if(nums[i]>9){
                temp = digitSum(nums[i]);
            }
            else {
                temp = nums[i];
            }
            if(i==temp) return i;
        }
        return -1;
    }
}