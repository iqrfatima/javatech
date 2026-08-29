public class LongestCount {
    public static int longestCount(int n){
        int digits = 1;
        int start = 1;
        int total = 0;
        while (start<=n) {
            int end  = Math.min(n,start*10 - 1);
            total+=(end-start+1)*digits;
            start*=10;
            digits++;
        }
        return total;

    }
    public static int digitsFromLtoX(int L,int X){
        return longestCount(X) - longestCount(L-1);
    }
    public static int findX(int h,int l,int k){
        while (l<=h) {
            int mid = l+(h-l)/2;
            int digits = digitsFromLtoX(l,mid);
            if(digits == k)
                return mid;
            if(digits<k)
                l= mid+1;
            else
                h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int  n = 1000;
        System.out.println(digitsFromLtoX(1,1000));
    }
    
}
