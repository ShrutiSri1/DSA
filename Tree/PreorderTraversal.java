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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> s=new Stack<>();
        TreeNode temp=root;
        s.push(root);
        while(!s.empty()){
            temp=s.pop();
            res.add(temp.val);
            if(temp.right!=null)s.push(temp.right);
            if(temp.left!=null)s.push(temp.left);
            
        }
        return res;
        
    }
}
