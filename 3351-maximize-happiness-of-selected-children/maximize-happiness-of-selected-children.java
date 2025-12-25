class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        long result =0;
        for(int i=0;i<k;i++){
            result += Math.max(0, h[h.length-1-i]-i);
        }
        return result;
    }
}