import java.util.Scanner;
import java.util.Stack;

public class insertInSk {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of stack");
        int n = sc.nextInt();
        System.out.println("enter stack elements");
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        //insert the number at given index
        System.out.println("give index and value to be inserted");
        int gIdx = sc.nextInt();
        int gVal = sc.nextInt();
        Stack<Integer> rt = new Stack<>();

        while (st.size()>gIdx-1) {
            rt.push(st.pop());
        }
       System.out.println(st.push(gVal));
       while (rt.size()>0) {
        st.push(rt.pop());
        
       }
       System.out.println(st);
    }    
}
