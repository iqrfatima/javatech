package array_dsa;
import java.util.Scanner;

public class duplicate {
    public static void findDup(int arr[],int n){
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(arr[i]==arr[j] && i!=j){
             c+=1;
            }
            }
        }
        System.out.println("duplicates are "+ c +" in given list");
        if(c==0)
        System.out.println("no duplicates found");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        findDup(arr, n);
        
    }
    
}
