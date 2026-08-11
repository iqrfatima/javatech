package Tree;

public class FindMinInBST {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root = null;
    
    public Node insert(Node root,int data){
        if(root == null)
            return new Node(data);
        if(root.data == data)
            return root;
        if(root.data > data)
            root.left = insert(root.left, data);
        else 
            root.right = insert(root.right, data);
        return root;
    }
    public Node minBST(Node root){
        if(root == null)
        return null;
        if(root.left == null)
            return root;
        return minBST(root.left);
    }

     public Node secondLargestNode(Node root){
        if(root == null)
        return null;
        
        return secondLargestNode(root.right.right);
    }

    public static void main(String[] args) {
        FindMinInBST tree = new FindMinInBST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 24);
        tree.root = tree.insert(tree.root, 69);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 32);
        tree.root = tree.insert(tree.root, 5);
        System.out.println(tree.minBST(tree.root).data);
        System.out.println(tree.secondLargestNode(tree.root).data + "second larget element of the tree");
    }
}
