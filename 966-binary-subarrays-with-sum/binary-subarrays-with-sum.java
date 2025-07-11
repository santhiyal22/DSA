class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int ans = 0;
       int prefix = 0;
       HashMap <Integer,Integer> count = new HashMap<>();
       count.put(0,1);
       for(int num:nums) {
        prefix += num;
        int key = prefix - goal;
        if(count.containsKey(key)) 
            ans += count.get(key);
            count.merge(prefix, 1, Integer::sum);
        }
       return ans;
    }
}