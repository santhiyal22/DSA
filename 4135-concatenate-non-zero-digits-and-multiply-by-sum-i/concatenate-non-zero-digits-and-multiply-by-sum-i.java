class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        long sum = 0;
        while(n > 0) {
            if(n%10 != 0) {
                digits.add(n%10);
                sum += n%10;
            }
                n/=10;
        }
        Collections.reverse(digits);
        long pro = 0;
       for (int digit : digits) {
        pro = pro * 10 + digit;
        }

     return pro * sum;
    }
}