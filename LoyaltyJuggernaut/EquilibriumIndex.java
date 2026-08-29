public class EquilibriumIndex{
    public static int equilibriumInd(int a[]){
        int total = 0;
        for(int n : a){
            total += n;
        }
        int leftSum = 0;
        for(int i = 0;i< a.length;i++){
            int rightSum = total - a[i] - leftSum;
            if(leftSum == rightSum){
                return i;
            } 
            leftSum+=a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1};
        System.out.println(equilibriumInd(arr));
        
    }
}