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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null) return res;
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        TreeNode temp=root;
        while(!st1.isEmpty()||!st2.isEmpty()){
            List<Integer> r=new ArrayList<Integer>();
            while(!st1.isEmpty()){
                temp=st1.pop();
                r.add(temp.val);
                if(temp.left!=null) st2.push(temp.left);
                if(temp.right!=null) st2.push(temp.right);
            }
            res.add(r);
            r=new ArrayList<Integer>();
            while(!st2.isEmpty()){
                temp=st2.pop();
                r.add(temp.val);
                if(temp.right!=null) st1.push(temp.right);
                if(temp.left!=null) st1.push(temp.left);
            }
           if(!r.isEmpty()) res.add(r);
        }
        return res;
        
    }
}
