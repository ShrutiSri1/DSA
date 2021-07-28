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
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        int l=height(root.left)+1;
       int r=height(root.right)+1;
        
        return Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
       
        if(root==null) return true;
        if(!(isBalanced(root.left)&&isBalanced(root.right)))
            return false;
        int l=height(root.left);
        int r=height(root.right);
        int bal=Math.abs(l-r);
        if(bal>1) return false;
        return true;
        
    }
}
