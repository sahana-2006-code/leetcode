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
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root);
        int max = Collections.max(map.values());
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()==max){
                ans.add(e.getKey());
            }
        }
        int[] anss = new int[ans.size()];
        for(int i=0;i<anss.length;i++){
            anss[i] = ans.get(i);
        }
        return anss;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }
}