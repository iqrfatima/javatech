import java.util.Scanner;

public class recur1 {
    public static int calSum(int n){
        if(n==0)
        return 0;
        else
        return n+calSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit value");
        int n =sc.nextInt();
        int p = calSum(n);
        System.out.println(p);
    }
    
}
