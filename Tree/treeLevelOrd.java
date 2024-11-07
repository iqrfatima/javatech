package Tree;
import java.util.LinkedList;
import java.util.Queue;

public class treeLevelOrd {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null) return;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node current = q.remove();
            if(current == null){
                System.out.println();
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }else{
                System.out.println(current.data+" ");
                if(current.left!=null)
                    q.add(current.left);
                    
                if(current.right!=null)
                    q.add(current.right);

            } 
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.buildTree(nodes);
        levelOrder(root);
    }
    
}
