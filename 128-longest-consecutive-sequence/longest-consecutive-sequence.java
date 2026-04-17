class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 0, cnt = 0, x=0;
        HashSet<Integer> st =  new HashSet<>();
        for(int i=0;i<n;i++) {
            st.add(nums[i]);
        }
        for(int it: st) {
            if(!st.contains(it-1)) {
                x = it;
                cnt = 1;
            }
            while(st.contains(x+1)) {
                x=x+1;
                cnt++;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}