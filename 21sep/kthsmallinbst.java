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
public int kthSmallest(TreeNode root, int k) {
    int [] ans  = new int [1];
    int [] count = new int [1];
    
    Inorder(root, ans,count,k);
    return ans[0];
}

public void Inorder(TreeNode root,int [] ans ,int[] count, int k){
    if(root == null){
        return ;
    }
    Inorder(root.left ,ans ,count ,k);
    count[0]+=1 ;
    if(count[0] == k){
        ans[0] = root.val;
        return ;
    }
    Inorder(root.right ,ans ,count ,k);
    
}

}