class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int res =1;
    int n= nums.length;
    if(nums.length==0) return 0;
    for(int i=1;i<n;i++)  {
            if(nums[i]==nums[i-1]) {
                continue;
            }
            if(nums[i]==nums[i-1]+1) {
             c++;
            }
            else {
                c=1;
            }
        res = Math.max(res,c);
    }
    return res;     
    }
}