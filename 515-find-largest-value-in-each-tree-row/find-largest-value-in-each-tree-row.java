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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> an = new ArrayList<>();
        if(root == null) return an;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        //an.add(root.val);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<=size;i++){ 
                list.add(q.peek().val);
            TreeNode c = q.poll();
            if(c.left!=null){
                q.add(c.left);
            }
            if(c.right!=null){
                q.add(c.right);
            }
        }
       Collections.sort(list);
       an.add(list.get(list.size()-1));
    }
    return an;
    }
}