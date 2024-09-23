package array_dsa;
import java.util.Scanner;

public class arrSum {
    public static void sum(int arr[],int n,int s){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                }
            }
        }
        
        


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter your sum");
        int s = sc.nextInt();
        sum(arr, n, s);
    }
    
}
