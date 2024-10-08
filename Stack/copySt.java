/*copy stack in same order using stack */

import java.util.*;

public class copySt {
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
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());

        }
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("copied stack in same order"+st);

        
    }
    
}
