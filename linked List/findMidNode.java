public class findMidNode {
    public static Node display(Node head){
        Node temp = head;
        while(head!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void midNode(Node head){
        int size =0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
         temp = head;
        int n = size/2;
        for(int i=0;i<n;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
        this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(89);
        Node e = new Node(90);
        Node f = new Node(70);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        midNode(a);



    }
    
}
