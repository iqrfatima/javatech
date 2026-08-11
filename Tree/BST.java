package Tree;

public class BST {
    class Node{
        int data;
        Node left;
        Node right;
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
    public Node Searching(Node root, int data){
        if(root == null)
            return root;
        if(root.data == data){
            System.out.println("data is found");
            return root;
        }
        if(root.data > data){
            return Searching(root.left,data);
        }
        else
            return Searching(root.right,data);
    }

    public void inorder(Node root){
        if(root!= null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BST tree  = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 24);
        tree.root = tree.insert(tree.root, 69);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 32);
        tree.root = tree.insert(tree.root, 5);


        tree.inorder(tree.root);
        System.out.println(tree.Searching(tree.root, 40).data);

    }
}
