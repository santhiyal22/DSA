class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int ans = -1;
        if(m * k > n) return -1;
       int low = Integer.MAX_VALUE;
       int high = Integer.MIN_VALUE;

for (int num : bloomDay) {
    low = Math.min(low, num);
    high = Math.max(high, num);
}
        while(low <= high) {
            int mid = (low + high)/2;
            if(possible(bloomDay, m, k, mid, n) == true) {
                ans = mid;
                high = mid - 1;
            }
            else 
            low = mid + 1;
        }
        return ans;
    }
    boolean possible(int[] arr, int m, int k, int day, int n) {
        int nob = 0;
        int cnt = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] <= day) {
                cnt++;
            }
            else {
                nob += cnt/k;
                cnt = 0;
            }
        }
        nob += cnt/k;

        if(nob >= m) {
            return true;
        }
        else {
            return false;
        }
    }
}