class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
         int ans = -1;
        for (int x : nums) {
            high = Math.max(high, x);
        }

        while(low <= high) {
            int mid = (low + high)/2;
            if(divisor(nums, mid, n) <= threshold) {
                ans = mid;
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
        return ans;
    }
    int divisor(int[] arr,int sd, int n) {
        int sc = 0;
        for(int i=0;i<n;i++) {
            sc += Math.ceil((double) (arr[i]) / (double) (sd));
        }
        return sc;
        
    }
}