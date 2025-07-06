class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int [] arr = {-1,-1};
        int j=0;
        for(int i=0;i<n;i++) {
           if(nums[i]==target) {
             if(arr[0]== -1)
              arr[0] = i;
             arr[1]= i;
           } 
        }
        return arr;
    }
}