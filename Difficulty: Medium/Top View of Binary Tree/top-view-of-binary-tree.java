/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Group{
    Node node;
    int col;
    Group(Node node , int col){
        this.node = node;   
        this.col = col;
    }
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        Queue<Group> q = new LinkedList<>();
        
        q.add(new Group(root,0));
        
       
        
        while(!q.isEmpty()){
             Group g = q.poll();
         Node n = g.node;
        int c = g.col;
            
            if(map.get(c)==null){
                map.put(c,n.data);
            }
            if(n.left!=null){
                q.add(new Group(n.left,c-1));
            }
            if(n.right!=null){
               q.add(new Group(n.right,                                                                  c+1));
            }
            
        }
        for(int k : map.values()){
            res.add(k);
        }
        
        return res;
        
        
        
    }
}