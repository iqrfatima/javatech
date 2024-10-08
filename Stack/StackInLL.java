public class StackInLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
   
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrev(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
                
            }
        }
        int size(){
            Node temp = head;
            while (temp!=null) {
                    size++;
                    temp = temp.next;
                    
             }
                return size;
            }
        int pop(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
             }
            int x = head.data;
            head = head.next;
            return x;
        }
        int peek(){
                Node temp = head;
                while (temp!=null) {
                    temp = temp.next;
                }
                return temp.data;
        }
    }
        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(4);
            st.push(5);
            st.push(7);
            st.push(3);  
            st.displayrev();
            System.out.println(st.peek());
            st.pop();
            st.displayrev();
        }    
        
    }
    /////
    

