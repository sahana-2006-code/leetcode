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
     List<Integer> leaves = new ArrayList<>();
    List<Integer> leaves2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 == null) return true;
        getLeaves1(root1);
        getLeaves2(root2);
        return leaves.equals(leaves2);
    }
    public void getLeaves1(TreeNode node){
        if(node == null) return;
        if(node.left == null && node.right == null){
            leaves.add(node.val);
            return;
        }
        getLeaves1(node.left);
        getLeaves1(node.right);
    }
    public void getLeaves2(TreeNode node){
        if(node == null) return;
        if(node.left == null && node.right == null){
            leaves2.add(node.val);
            return;
        }
        getLeaves2(node.left);
        getLeaves2(node.right);
    }
}