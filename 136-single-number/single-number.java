class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int c:nums) {
           freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(int c: nums) {
            if(freq.get(c)==1) {
              return c;
            }
        }
        return -1;
    }
}