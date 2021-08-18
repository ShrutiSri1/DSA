/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=Integer.MIN_VALUE;
    public int maxSum(TreeNode root){
        if(root==null)
            return 0;
        int l=maxSum(root.left);
        int r=maxSum(root.right);
        int temp=Math.max(Math.max(l,r)+root.val,root.val);
        int ans=Math.max(l+r+root.val,temp);
        res=Math.max(res,ans);
        return temp;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        maxSum(root);
        return res;
    }
}
