class Solution {
public:
    bool checkTree(TreeNode* root) {
        if(root==NULL) return true;
        if(root->left == NULL && root->right == NULL) return true;
        int sum = 0;
        if(root -> left != 0)
        sum += root -> left->val;
         if(root -> right != 0)
        sum += root -> right ->val;

        return (sum==root->val && checkTree(root->right) && checkTree(root->left));
    }
};