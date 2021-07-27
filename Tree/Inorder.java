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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode temp=root;
        while(temp!=null|| !s.empty())
        {
            while(temp!=null)
            {
                s.add(temp);
                temp=temp.left;
            }
            temp=s.pop();
            l.add(temp.val);
            temp=temp.right;
            
        }
        
        return l;
        
    }
    
}
