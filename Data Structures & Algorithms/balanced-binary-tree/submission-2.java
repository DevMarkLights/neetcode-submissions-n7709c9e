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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true;
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        return (Math.abs(left[1]-right[1]) < 2 && left[0] == 0 && right[0] == 0);
        
    }

    public int[] helper(TreeNode root){

        if(root == null){
            return new int[]{0,0};
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);
                            
        boolean balanced = (Math.abs(left[1]-right[1]) < 2 && left[0] == 0 && right[0] == 0);
        // 0 true
        // 1 false
        return new int[]{ balanced == true ? 0 : 1 , 1 + Math.max(left[1],right[1])};
    }
}
