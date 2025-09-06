//combination and permitution

import java.util.Scanner;

public class CombandPerm {
    public static void main(String[] args) {
        System.out.println("enter n and r values");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        float combination = fact(n)/(fact(n-r)*fact(r));
        float permutation = fact(n)/fact(r);
        System.out.println("combination: "+combination+" "+"permutation:"+permutation);

    }
    public static int fact(int x){
        int Fact = 1;
        for(int i=1;i<=x;i++)
            Fact *=i;
        return Fact;
    }
}
