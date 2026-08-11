public class NQueens {
    int n;
    int x[];
    public NQueens(int n)
    {
        this.n = n;
        x = new int[n];
    }

    public void queens(int k, int n)
    {
        for(int i=0;i<n;i++)
        {
            if(place(k,i))
            {
                x[k] = i;
                if(k == n-1) {
                    displayX();
                }
                else
                    queens(k+1,n);
            }
        }
    }

    public boolean place(int k, int i)
    {
        for(int j=0;j<k;j++)
            if((x[j]==i) || (Math.abs(x[j]-i)==Math.abs(j-k)))
                return false;
        return true;
    }

    public void displayX()
    {
        for(int i=0;i<n;i++)
            System.out.print(x[i]+"\t");
        System.out.println();
    }

    public static void main(String args[])
    {
        int n = 4;
        NQueens q = new NQueens(n);
        q.queens(0, n);
    }
}
