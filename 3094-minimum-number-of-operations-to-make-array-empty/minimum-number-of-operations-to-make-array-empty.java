class Solution {
    public int minOperations(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int count =0;

        for (int i : map.keySet()){
            int freq = map.get(i);
            if (freq == 1) return -1;
            count += freq/3;
            if (freq%3!=0) count++; 

        }

        return count;
    }
} 