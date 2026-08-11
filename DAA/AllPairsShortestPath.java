public class AllPairsShortestPath {
    int n;
    int cost[][];
    int A[][];

    public AllPairsShortestPath()
    {
        n = 3;
        cost = new int[][]{
                {0, 4, 11},
                {6, 0, 2},
                {3, Integer.MAX_VALUE, 0}
        };
        A = new int[n][n];
    }

    public void AllPairs()
    {
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                A[i][j] = cost[i][j];
        for(int k=0;k<n;k++)
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    A[i][j] = minValue(A[i][j],A[i][k]+A[k][j]);
    }

    public int minValue(int x, int y)
    {
        if(x<y)
            return x;
        else
            return y;
    }

    public void displayA()
    {
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        AllPairsShortestPath apsp = new AllPairsShortestPath();
        apsp.AllPairs();
        apsp.displayA();
    }
}
