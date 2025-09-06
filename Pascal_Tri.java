public class Pascal_Tri {
    public static void main(String[] args) {
        int ncr=1;
        for(int n=0;n<5;n++){
            for(int r=0;r<=n;r++){
                if(n>=r)
                ncr = fact(n)/(fact(n-r)*fact(r));
                System.out.print(ncr);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static int fact(int x){
        int Fact = 1;
        for(int i=1;i<=x;i++)
            Fact *=i;
        return Fact;
    }
}
