class Solution {
    public int splitArray(int[] nums, int k) {
       int max = 0, sum = 0, ans = -1;
        if (k > nums.length) return -1;
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        int low = max, high = sum;
        while(low <= high) {
            int mid = (low+high)/2;
            
            if(func(nums, mid, k) == true) {
                ans = mid;
                high = mid - 1;
            }
            else
            low = mid+1;
        }
        return ans;
    }
    boolean func(int[] arr, int val, int k1) {
        int cnt = 1, val2 = val;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > val) {
                cnt++;
                val = val2;
                val -= arr[i];
            }
            else {
                val -= arr[i];
            }
        }
        if(cnt <= k1) 
        return true;
        else
        return false;  
    }

}