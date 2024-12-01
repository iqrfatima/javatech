public class array {
    public static void main(String[] args) {
        int t=0;
        int arr[] = {1,3,4,5};
        int copiedArr[] = arr.clone();
        for(int i=0; i<arr.length;i++){
            if(arr[i]==copiedArr[i]) 
            t=1;
         }
         if(t==1)
         System.out.println("cloned");

    }
    
}
