/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:

void pre(TreeNode* root, TreeNode* &temp, TreeNode* target) {
    if(root == NULL) return;

    if(root->val == target->val) {
        temp = root;
    }

    pre(root->left, temp, target);
    pre(root->right, temp, target);
}
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        TreeNode* temp = NULL;
        pre(cloned, temp, target);
        return temp;
        }
};