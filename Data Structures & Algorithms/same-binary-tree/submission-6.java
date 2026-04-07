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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if( (p != null && q == null) || (p == null && q != null)){
            return false;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addFirst(p);
        queue.addFirst(q);
        while (!queue.isEmpty()){
            TreeNode rightNode = queue.removeLast();
            TreeNode leftNode = queue.removeLast();

            if(rightNode.val != leftNode.val){
                return false;
            }

            if(rightNode.left != null && leftNode.left != null){
                queue.addFirst(rightNode.left);
                queue.addFirst(leftNode.left);
            } 
            if(rightNode.right != null && leftNode.right != null){
                queue.addFirst(rightNode.right);
                queue.addFirst(leftNode.right);
            }
            if((rightNode.left == null && leftNode.left != null) || (rightNode.left != null && leftNode.left == null) || 
            (rightNode.right == null && leftNode.right != null) || (rightNode.right != null && leftNode.right == null)){
               return false;
            }
        }
        return true;
    }
}
