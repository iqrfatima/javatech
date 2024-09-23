import java.util.Scanner;

public class recur3 {
    public static int calfact(int n){
        if(n==0)
        return 1;
        else
        return n*calfact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit value");
        int n = sc.nextInt();
        int p= calfact(n);
        System.out.println(p);



        
    }
    
}
