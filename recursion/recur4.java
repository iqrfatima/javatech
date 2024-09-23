import java.util.Scanner;

public class recur4 {
    public static int exp(int n,int x){
        if(n==0)
        return 1;
        else
        return x*exp(n-1, x); 


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and n value");
        int n= sc.nextInt();
       // System.out.println("enter ");
        int x=sc.nextInt();
        int p=exp(n, x);
        System.out.println(p);
    }
}