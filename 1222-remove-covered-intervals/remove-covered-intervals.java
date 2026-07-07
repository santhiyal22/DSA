class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        int res = 0;
        int n = inter.length;
        int [][] arr = new int[n][2];
       Arrays.sort(inter, (a, b) -> {
    if (a[0] == b[0]) return b[1] - a[1];
    return a[0] - b[0];
});
            int start = inter[0][0];
            int end = inter[0][1];
             arr[res][0] = inter[0][0];
             arr[res][1] = inter[0][1];
             res++;
        for(int i=1;i<n;i++) {
            int start1 = inter[i][0];
            int cuend = inter[i][1];

            if(start < start1) {
                if(end < cuend) {
                arr[res][0] = start;
                arr[res][1] = cuend;
                res++;
                start = start1;
                end = cuend;
            }
            }
        }
        return res;
    }
}