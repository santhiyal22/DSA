/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
int maxDep(TreeNode* root) {
    if(root == NULL) return 0;

    return max(maxDep(root->left), maxDep(root->right))+1;
}
    int maxDepth(TreeNode* root) {
      int h =  maxDep(root);
      return h;
    }
};