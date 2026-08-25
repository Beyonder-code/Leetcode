class Solution {
    public int missingMultiple(int[] nums, int k) {
      HashSet <Integer> set = new HashSet<> ();
   //   boolean flag []=new boolean[101];
      int max =0;
      for (int i : nums){
        set.add(i);
        
       max = Math.max(i,max);
      }
      for (int i =1; i<=100; i++){
        int n = k*i;
     
       if (!set.contains(n)) return n;
      }
      return max+1;
    }
}