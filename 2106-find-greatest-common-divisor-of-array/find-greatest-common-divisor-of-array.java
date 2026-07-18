class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = nums[0], max = nums[0];

        for (int i = 0; i < n; i++) {
            if (min > nums[i])
                min = nums[i];

            if (max < nums[i])
                max = nums[i];
        }

        while (max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return min;
    }
}