class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int sum = 0;
        //         for (int l = i; l <= j; l++) {
        //             sum += nums[l];
        //         }

        //         if (sum == k)
        //             cnt++;
        //     }
        // }
        // return cnt;


         int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
             int sum = 0; 
            for (int j = i; j < n; j++) {
                    sum += nums[j];

                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
}