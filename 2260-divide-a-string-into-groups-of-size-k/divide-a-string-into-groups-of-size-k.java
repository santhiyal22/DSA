class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int totalSize = (n + k - 1) / k;
        int j=0, i=0;
        String [] arr = new String [totalSize];
        String res = "";
        while(j<n) {
            res  += s.charAt(j);
            if(res.length()==k) {
                arr[i++]=res;
                res = "";
            }
            j++;
           }
           if(res != "") {
            while(res.length()<k) {
                res += fill;
            }
            arr[i]=res;
        }
        return arr;
    }
}