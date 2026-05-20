class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int diff=0;
        int newdiff=0;
        diff=Math.abs(arr[0]-arr[1]);
        for( int i=1;i<n-1;i++){
            
          newdiff=Math.abs(arr[i]-arr[i+1]);
          if(diff != newdiff) return false;
        }
        return true;
    }
}