// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs[0] == ""|| strs.length == 0) return "";
//         if(strs.length == 1) return strs[0];
//         String s = "";
//         String t = strs[0];
//         int j= 0;
//         for(int i=1;i<strs.length;i++) {
//             if(t.charAt(j)==strs[i].charAt(j)) {
//                 s+=t.charAt(j);
//                 j++;
//             }else{
//                 return s;
//             }
//         }
//         return s;
//     }
// }

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        for(int i=0;i<strs[0].length();i++) {
        for(int j=1;j<n;j++) {
            if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)){
                return strs[0].substring(0,i);
            }
         }
        }
        return strs[0];
    }
}