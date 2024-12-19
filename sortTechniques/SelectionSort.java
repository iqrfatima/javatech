package sortTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,34,56,7,43};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp;
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
           System.out.println(i); 
        }
    }
    
}
