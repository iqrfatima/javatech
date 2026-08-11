import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void BFSMthd(int start,int graph[][]){
        int n = 5;
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node);
            for(int i=0;i<n;i++){
                if(graph[node][i] == 1 && !visited[i]){
                    // DFSMthd(node, graph);
                    visited[i] = true;
                    q.add(i);
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
        BFSMthd(0, graph);
    }
    
}
