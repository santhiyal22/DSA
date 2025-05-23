class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        if (s1.size() != s2.size()) {
            return false;
        }
         int first = -1, sec = -1;

        for (int i = 0; i < s1.size(); i++) {
            if(s1[i] != s2[i]) {
                if (first == -1) {
                    first = i;
                } else if (sec == -1) {
                    sec = i;
                } else {
                    return false;
                }
            }
        }
        if (first == -1 && sec == -1)
            return true;
        return (sec != -1 && s1[first] == s2[sec] && s1[sec] == s2[first]);
    }
};