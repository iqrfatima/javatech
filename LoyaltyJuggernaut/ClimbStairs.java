import java.util.Scanner;

public class ClimbStairs {
    public static int climbStairs(int n){
        if(n<=2)
            return n;
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
            System.out.println(dp[i]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of stairs:");
        int n = sc.nextInt();
        System.out.println(climbStairs(n));

    }
}
