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
    long prev = Long.MIN_VALUE;
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        if(flag){
            if(root==null) return true;
            isValidBST(root.left);
            if(prev<root.val){
                prev=root.val;
            }else flag=false;
            isValidBST(root.right); 
        }
        return flag;
    }
}