import java.util.*;
public class linkedList{
    
    public static void size(Node head){
        int n=0;
        while(head!=null){
            n++;
            head=head.next;
        }
        System.out.println("size of list "+n);
    }
    public static void Display(Node head){
        if(head==null)
        return;
        System.out.println(head.data+" ");
        Display(head.next);
    }
    public static void Displayr(Node head){
        if(head==null)
        return;
        Display(head.next);
        System.out.println(head.data+"in reverse using recursion ");
      
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
        a.next = b;
        b.next = c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);

       
        Node temp = a;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        
        Display(a);
        Displayr(a);
        size(a);


    }
}