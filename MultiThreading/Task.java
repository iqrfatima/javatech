package MultiThreading;
import java.util.*;

class Task extends Thread{
    synchronized void printer() {
        System.out.println("Task in syncronized block is running");
    }
    public void run() {
        int i = 0;
        System.out.println("Task running"+i++);
    }
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();

        t1.start();//create a thread
        t1.run();// run a a thread
        t2.start();
        t2.run();
        t1.printer();
        t2.printer();
    }
    
}
