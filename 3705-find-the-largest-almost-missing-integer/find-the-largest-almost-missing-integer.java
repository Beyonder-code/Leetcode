class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap <> ();
        for (int i =0; i<=n-k; i++){
            for (int j =i; j<i+k; j++)
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);


        }
        int ans = -1; 
        for (int i : map.keySet() ){
            int temp = map.get(i);
            
            if(temp==1 && i>ans) ans =i;
            else if (k==n && i>ans) ans = i;
        }
        return ans;
    }
}
