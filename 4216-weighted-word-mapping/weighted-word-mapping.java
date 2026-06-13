class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String word: words) {
            int s = 0;
            for(char c: word.toCharArray()) {
                s +=  weights[c - 'a'];
            }
            ans.append((char) ('z' - (s%26)));
        }
        return ans.toString();
    }
}                                                     