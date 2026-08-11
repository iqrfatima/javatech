package linkedList.DoubleLL;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static int size(Node head){
        Node temp = head;
        int count = 1;
        while(temp!=null){
        temp=temp.next;
        count++;
        }
        return count;
    }

    public static void displayDLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void displayRDLL(Node tail){
        Node temp = tail;
        System.out.println("linked list in reverse");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public static void insertion(Node head,int pos,int data){
        Node newNode = new Node(67);
        if(pos == 1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
        }
        if(pos<size(head) && pos!=1){
            Node temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;
        }
        if(pos == size(head)){
            Node temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.prev = temp; 
            temp.next = newNode;
            newNode.next = null;
        }


    }
    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(4);
        Node c = new Node(56);
        Node d = new Node(98);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        displayDLL(a);
        displayRDLL(d);
        // insertion(a, 1, 30);
        // displayDLL(a);
        // insertion(a, 3, 52);
        // displayDLL(a);
        insertion(a, 4, 48);
        displayDLL(a);

    }
    
}
