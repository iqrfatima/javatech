package linkedList;

import java.util.Scanner;

public class LinkedListCycle {
     public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean cycleCheck(Node head,Node cycleNode,int n){
        Node temp = head;
        for(int i=1;i<=n;i++){
            if(temp == cycleNode)
            return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("cycle position");
        int pos = sc.nextInt();
        System.out.println("enter elements");
        Node head = null;
        Node cycleNode = null;
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            Node newNode = new Node(x);
            head = newNode;
            newNode = newNode.next;
            if(i==pos){
                cycleNode = newNode;
            }
        }
        System.out.println(cycleCheck(head,cycleNode,n));
    }
    
}
