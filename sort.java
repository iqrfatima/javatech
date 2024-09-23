import java.util.Scanner;
class sort{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit value");
        int n =sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (arr[i]<arr[j]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    
                }
            }
        }
        for( int i=0;i<n;i++)
        System.out.println(arr[i]);
        
    }
}