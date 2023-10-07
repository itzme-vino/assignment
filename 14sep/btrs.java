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
 
    int maxLevel = 0;
    public void rightSide(TreeNode root,  List<Integer> list,int level){
        if(root == null)
            return;

        if(maxLevel < level)
        {
            list.add(root.val);
            maxLevel = level;
        }
        rightSide(root.right,list,level + 1);
        rightSide(root.left,list,level + 1);
    }
     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightSide(root,list,1);
        return list;
    }
}