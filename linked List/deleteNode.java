public class deleteNode {
    //to display the node
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //function to display particular node
    public static Node nthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    
    }

    //delete given node
    public static Node deleteNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
        
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
   
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(89);
        Node e = new Node(90);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node g = nthNode(a, 4);
        deleteNthNode(a, 3);
        display(a);
        System.out.println(g.data);
       // System.out.println();
       // System.out.println(display(a));
        
}
}
