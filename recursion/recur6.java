// import java.util.*;
public class recur6 {
    public static void hanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
            return;
        }
        hanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
        hanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n=3;
        hanoi(n,"s","h","d");
       
        
    }
    
}
