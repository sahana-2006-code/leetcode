/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        post(root);
        return ans;
    }
    public void post(Node root){ 
        if(root==null) return;
        List<Node> nn = root.children;
        for(int i=0;i<nn.size();i++){ 
    post(root.children.get(i));
        }
    ans.add(root.val);
}
}