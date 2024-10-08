public class StackInArr {
    public static class Stack{
        int[] arr = new int[50];
        int idx = 0;
        void push(int x){
            arr[idx] = x;
            idx++;
          

        }

        int peek(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++)
            System.out.println(arr[i]);
        
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(7);
        st.push(3);  
        st.display();
        System.out.println(st.peek());
        st.pop();
    }    
}
