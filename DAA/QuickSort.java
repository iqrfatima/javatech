public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {7,2,3,8,6,4};
        quickSort(arr, 0, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int partition(int arr[],int low,int high){
        int p=a[low],j=high,i=low+1;
        do{
            do{
                i++;
            }while(a[i]<=p && i<=high);
            do{
                j--;
            }while(a[j]>=p && j>=low);
            if(i<j)
                swap(a,i,j);
        }while(i<j);
        swap(a,low,j);
    }
    public static void quickSort(int arr, int low,int high){
        if(low<=high){
            int j = partition(arr,low,high);
            QuickSort(arr,low,j-1);
            QuickSort(arr,j+1,high);
        }
    }
    public void swap(int a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
