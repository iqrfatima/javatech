import java.util.Scanner;
import java.util.*;

public class stackIsBal {
    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        int n=s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(') 
            st.push(ch);
            else{
                if(st.size()==0) 
                return false;
                if(st.peek()=='(') 
                st.pop();
            }
        }
        if(st.size()>0) 
        return false;
        else
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
    
}
