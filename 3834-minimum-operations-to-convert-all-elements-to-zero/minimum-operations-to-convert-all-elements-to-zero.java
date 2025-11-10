class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i: nums) {
        while(!st.empty() && st.peek() > i) {
            st.pop();
        }
        if(i==0) continue;

        if(st.empty() || st.peek() < i) {
            count++;
             st.add(i);
        }
        }
        return count;
    }
}