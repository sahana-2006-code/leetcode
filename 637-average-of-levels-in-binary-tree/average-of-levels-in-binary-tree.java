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
    List<List<Integer>> ans =  new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> an = new ArrayList<>();
        if(root == null) return an;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
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
        ans.add(list);
    }
    for(int i=0;i<ans.size();i++){
        List<Integer>  l = ans.get(i);
        double sum=0;
        for(int j=0;j<l.size();j++){
            sum += l.get(j);
        }
        an.add(sum/l.size());
    }
    return an;
    }
}