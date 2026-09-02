public class FractionalKnapsack {
    public static int fracKnapsack(int p[],int w[],int x[],int c){
        int profit = 0;
        int i = 0;
        for (int j =0;j<p.length;j++) {
            x[j] = 0;
        }
        for (i=0;i<p.length;i++) {
            if(c<w[i]) break;
            x[i] = 1;
            c = c-w[i];
        }
        if(i<=p.length)
            x[i] = c/w[i];
        for (i=0;i<p.length;i++) {
            profit+= p[i]*x[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        int p[]={15,6,8,12};
        int w[] = {3,5,4,6};
        int c = 12;
        System.out.println(fracKnapsack(p, w, new int[p.length], c));
    }
}
