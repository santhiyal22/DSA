class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack <int> s;
        unordered_map <int,int> m;
        int n2 = nums2.size(); 
        for(int i=0;i<n2;i++) {
            while(!s.empty() && s.top() <= nums2[i]) {
               m[s.top()] = nums2[i];
               s.pop();
            }
            s.push(nums2[i]);
        }
        int n1 = nums1.size();
        for(int i=0;i<n1;i++) {
            nums1[i] = m.contains(nums1[i])?m[nums1[i]]:-1;
        }
        return nums1;
    }
};