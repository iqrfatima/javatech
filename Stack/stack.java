import java.util.Scanner;
import java.util.Stack;

public class stack {
   
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
        int m = st.size();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
        arr[i] = st.peek();
        st.pop();
        }
        for(int i=m-1;i<=0;i--)
        System.out.println(arr[i]);

       
    }
    
}
