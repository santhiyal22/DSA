class Solution {
    public String thousandSeparator(int n) {
        int count =0;
        String nStr = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=nStr.length() -1;i>=0;i--) {
            sb.append(nStr.charAt(i));
                count++;
            if(count % 3 == 0 && i != 0) {
                sb.append(".");
            
            }
        }
        return sb.reverse().toString();
    }
}