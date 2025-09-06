package Queue;

public class QueueImArr {
    static int queue[]=new int[20];
    static int n = 20;
    static int rear = -1,front = -1;
    static void enqueue(int x){
        if(front == n-1){
            System.out.println("queue is empty");
        }
        else{
            if(rear == -1)
            front = 0;
            queue[++rear] = x;
        }
    }
    public static int dequeue(){
        int deqele;
        if(front == -1){
            System.out.println("empty");
            return 0;
        }
        else{
            deqele = queue[front];
            front++;
        }
        return deqele;
    }
    public static int peek(){
        int ele;
        if(front == -1){
            System.out.println("empty");
            return 0;
        }
        ele = queue[front];
        return ele;
    }
    public static void display(){
        if(front == -1){
            System.out.println("empty");
        }
        else{
        for(int i=front;i<=rear;i++)
        System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        enqueue(20);
        enqueue(900);
        enqueue(2);
        peek();
        enqueue(29);
        dequeue();
        display();
    }
}
