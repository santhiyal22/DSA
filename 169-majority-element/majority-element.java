class Solution {
    public int majorityElement(int[] nums) {
        //MAP
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
         freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if(entry.getValue() > n/2) {
                int Key = entry.getKey();
                return Key;

            }
        }
        return -1;
    }
}