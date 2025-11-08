class Solution {
    public int minimumOneBitOperations(int n) {
    // String Binary = Integer.toBinaryString(n);
    // StringBuilder sb = new StringBuilder(Binary);
    // int count = 0;
    // for(int i=0;i<sb.length();i++) {
    // if(sb.charAt(i) == '1') {
    //     sb.setCharAt(i, '0');
    //     count++;
    // }
    // }
    // return count;
    int ans = n;
        // Continue applying the operation (ans ^= ans >> 1) until ans becomes 0
        // The final result 'n' will hold the correct operation count.
        while (ans != 0) {
            n ^= ans >> 1;
            ans >>= 1;
        }
        return n;
    }
}