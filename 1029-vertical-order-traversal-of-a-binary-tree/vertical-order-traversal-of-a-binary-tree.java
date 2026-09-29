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
 class Pair{
    int row;
    int depth;

    TreeNode node;
    Pair(int row,int depth,TreeNode node){
        this.row = row;
        this.depth = depth;
        this.node = node;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
     //   Map<Integer,List<Integer>> map = new TreeMap<>();
     Map<Integer,Map<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        q.add(new Pair(0,0,root));
       // int d=0;
        while(!q.isEmpty()){
                 Pair curri = q.poll();
                 int row = curri.row;
                int d = curri.depth;
                TreeNode curr = curri.node;
                 if(curr.left!=null){
                    q.add(new Pair(row+1,d-1,curr.left));
                   }
                 if(curr.right!=null){
                    q.add(new Pair(row+1,d+1,curr.right));
                   }
                     map.putIfAbsent(d,new TreeMap<>());
                     map.get(d).putIfAbsent(row,new PriorityQueue<>());
                     map.get(d).get(row).add(curr.val);
                  //  map.get(d).get(row).add(curr.val);
                 }
            for(Map<Integer,PriorityQueue<Integer>> colmap : map.values()){
                List<Integer> list = new ArrayList<>();
                 for(PriorityQueue<Integer> nodes : colmap.values()){
                    while(!nodes.isEmpty()){
                        list.add(nodes.poll());
                    }
                 }
                 ans.add(list);
            }
            return ans;
        }
    }