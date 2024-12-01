package Queue;
class CirQueue{
    //circular queue using array 
    static int rear = -1;
    static int front = -1;
    static int n=5;
    static int Queue[] = new int[n];
    // public CirQueue(int rear,int front,int n,int Queue[]){
    //     this.rear=rear;
    //     this.front=front;
    //     this.n=n;
    //     this.Queue=Queue;
    // }
    public static void enqueue(int value){
        if((rear+1)%n==front){
            System.out.println("its full");
            return;
        }
        else if(rear==-1&& front==-1){
            rear=front=-1;
            rear=front=0;
            Queue[rear]=value;

        }
        else{
            rear=(rear+1)%n;
            Queue[rear]=value;
        }
    }
    public static void dequeue(){
        if(rear==front){
            rear=front=-1;
            rear=front=0;
            System.out.println("its empty");
        }else{
            front=  (front+1)+n;
            System.out.println("dequeued"+Queue[front]);
        }
    }
    public static void display(){
        if(rear==-1 && front==-1){
            System.out.println("its empty");
        }else{
            int i=front;
            while (i!=rear) {
                System.out.println(Queue[i]);
                i=(i+1)%n;
            }
        }
    }
    public static void main(String[] args) {
     enqueue(2);
     enqueue(98);
    //  enqueue(29);
     enqueue(26);
     dequeue();
     enqueue(23);
     display();
    }
}