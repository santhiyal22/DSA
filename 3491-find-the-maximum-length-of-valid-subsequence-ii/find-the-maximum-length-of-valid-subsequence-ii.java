class Solution {
    public int maximumLength(int[] nums, int k) {
      int q = nums.length;
      int [][] sub = new int[k][k];
      int count = 0;
      for(int n:nums) {
        n%=k;
        for(int i=0;i<k;i++) {
            sub[i][n] = sub[n][i]+1;
            // sub[i] = nums[i];
            count=Math.max(count, sub[i][n]);
        }
      }
      return count;
    }
}