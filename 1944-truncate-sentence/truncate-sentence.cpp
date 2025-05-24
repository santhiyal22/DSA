class Solution {
public:
    string truncateSentence(string s, int k) {
        string res = "";
        int wordcount=0;
        for(int i=0;i<s.length();i++) {
            if(s[i]==' ') {
                wordcount++;
            }
            if(wordcount==k) 
            break;
        res +=s[i];
        }
        return res;
    }
};