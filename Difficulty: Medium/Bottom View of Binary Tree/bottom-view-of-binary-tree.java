/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
class Group{
    Node node;
    int col;
    
    Group(Node node , int col){
        this.node=node;
        this.col=col;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Group> q = new LinkedList<>();
        
        q.add(new Group(root,0));
        
        while(!q.isEmpty()){
            Group g = q.poll();
            Node n = g.node;
            int c = g.col;
            
        map.put(c,n.data);
        
        if(n.left!=null){
            q.add(new Group(n.left,c-1));
        }
         if(n.right!=null){
            q.add(new Group(n.right,c+1));
        }
        }
        
        for(int k: map.values()){
            res.add(k);
        }
        return res;
    }
}