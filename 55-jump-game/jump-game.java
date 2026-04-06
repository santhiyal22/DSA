class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
         int newReach = 0;
        int maxReach = Math.max(0, 0+nums[0]);
        for(int i=1;i<n;i++) {
           
            if(i<= maxReach) {
              newReach = i+nums[i];
            }
            if(i > maxReach) {
                return false;
            }
             maxReach = Math.max(newReach, maxReach);
        }
        return true;        
    }
}