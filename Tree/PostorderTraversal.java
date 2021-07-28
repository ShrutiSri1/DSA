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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null)return l;
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp=root;
        s.push(root);
        while(!s.empty()){
           temp=s.pop();
            l.add(0,temp.val);
            if(temp.left!=null) s.push(temp.left);
            if(temp.right!=null)s.push(temp.right);
        }
        return l;
        
    }
}
