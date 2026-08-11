public class GraphColoring {
    int n;
    int m;
    int cost[][];
    int x[];

    public GraphColoring()
    {
        n = 5;
        cost = new int[][]{
                {0,1,1,0,1},
                {1,0,1,0,1},
                {1,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0}
        };
        m = 3;
        x = new int[n];
    }

    public void mColoring(int k)
    {
        do {
            nextValue(k);
            if(x[k]==0)
                return;
            if(k==n-1)
                display();
            else
                mColoring(k+1);
        }while(true);
    }

    public void nextValue(int k)
    {
        do {
            int j=0;
            x[k] = (x[k]+1) % (m+1);
            if(x[k]==0)
                return;
            for(j=0;j<n;j++)
                if((cost[k][j]!=0) && (x[k]==x[j]))
                    break;
            if(j==n)
                return;
        }while(true);
    }

    public void display()
    {
        for(int i=0;i<n;i++)
            System.out.print(x[i]+"\t");
        System.out.println();
    }

    public static void main(String args[])
    {
        GraphColoring c = new GraphColoring();
        c.mColoring(0);
    }

}
