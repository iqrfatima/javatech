import java.util.Stack;

public class DFS {
    public static void DFSMthd(int start,int graph[][]){
        int n = 5;
        boolean visited[] = new boolean[n];
        Stack<Integer> s = new Stack<>();
        visited[start] = true;
        s.push(start);

        while(!s.isEmpty()){
            int node = s.pop();
            System.out.println(node);
            for(int i=n-1;i>=0;i--){
                if(graph[node][i] == 1 && !visited[i]){
                    // DFSMthd(node, graph);
                    visited[i] = true;
                    s.push(i);
                }
            }

        }
    }
    public static void main(String[] args) {
        int graph[][]= {
            {0,1,1,0,0},
            {1,0,0,1,0},
            {1,0,0,1,1},
            {0,1,1,0,1},
            {0,0,1,1,0}
        };
        DFSMthd(0, graph);
    }
    
}