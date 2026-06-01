class Solution {
    public int minimumCost(int[] cost) {
        int ans=0;
        int n=cost.length;
        Arrays.sort(cost);
        int j=cost.length-1;

        for(int i =n-1; i>=0;i--){
            if(j - i == 2){
                j = j - 3;
                continue;
            }
            ans+=cost[i];
            
        }
        return ans;
    }
}