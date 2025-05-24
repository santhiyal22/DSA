class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
      int n= capacity.length;
      Arrays.sort(capacity);
      int s=0;
      for(int x:apple)
      s+=x;

      for(int i = 1;i<=n; ++i) {
        s-=capacity[n-i];
        if(s<=0) {
        return i;
        }
      } 
      return 0; 
    }
}