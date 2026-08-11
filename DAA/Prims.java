public class Prims {
    // static final int INF = 999;

    public static void main(String[] args) {
        int[][] cost = {
            {Integer.MAX_VALUE,28,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,10,Integer.MAX_VALUE},
            {28,Integer.MAX_VALUE,16,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,14},
            {Integer.MAX_VALUE,16,Integer.MAX_VALUE,12,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,12,Integer.MAX_VALUE,22,Integer.MAX_VALUE,18},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,22,Integer.MAX_VALUE,25,24},
            {10,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,25,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,14,Integer.MAX_VALUE,18,24,Integer.MAX_VALUE,Integer.MAX_VALUE}
        };

        int n = 7;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int minCost = 0;

        System.out.println("Edges:");

        for (int k = 0; k < n - 1; k++) {
            int min = Integer.MAX_VALUE, u = -1, v = -1;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && cost[i][j] < min) {
                            min = cost[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            visited[v] = true;
            minCost += min;
            System.out.println(u + " - " + v);
        }

        System.out.println("Minimum Cost = " + minCost);
    }
}