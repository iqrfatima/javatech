import java.util.*;

public class TravellingSalesperson {

    int n;
    int Adjmat[][];
    int[] verticesSet;

    public TravellingSalesperson()
    {
        n = 4;
        Adjmat = new int[][]{
                {0,10,15,20},
                {5,0,9,10},
                {6,13,0,12},
                {8,8,9,0}
        };
        verticesSet = new int[n-1];
        for(int i=1;i<n;i++)
            verticesSet[i-1] = i;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Permutation(0, nums, result);
        return result;
    }

    private void Permutation(int i, int[] nums, List<List<Integer>> result) {
        if (i == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            result.add(list);
        } else {
            for (int j = i, l = nums.length; j < l; j++) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                Permutation(i + 1, nums, result);
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }

    int tspdp()
    {
        int mincost = 9999;
        int minpath[] = new int[n+1];
        List<List<Integer>> result1 = permute(verticesSet);
        Iterator itri = result1.iterator();
        while(itri.hasNext()) {
            int cost = 0;
            int path[] = new int[n+1];
            int ipath= 1;
            ArrayList<Integer> o = (ArrayList<Integer>)itri.next();
            Iterator itrj = o.iterator();
            while(itrj.hasNext()) {
                path[ipath++] = (int)itrj.next();
            }
            for(int i=0;i<n;i++) {
                cost = cost + Adjmat[path[i]][path[i+1]];
            }
            if(cost < mincost)
            {
                mincost = cost;
                minpath = path;
            }
        }
        System.out.println("Minimum Cost Tour: "+mincost);
        for(int i=0;i<n;i++) {
            System.out.print(minpath[i]+"-->");
        }
        System.out.print(minpath[n]);
        System.out.println();
        return 0;
    }

    public static void main(String args[])
    {
        TravellingSalesperson t = new TravellingSalesperson();
        int cost = t.tspdp();
    }

}
