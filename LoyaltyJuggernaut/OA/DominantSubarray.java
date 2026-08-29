package OA;

import java.util.HashMap;

public class DominantSubarray {
    public static int countDominant(int[] a,int k){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int l = 0;
        int ans = 0;
        for(int r=0;r<a.length;r++){
            freq.put(a[r],freq.get(a[r],0)+1);
            while (freq.get(a[r])>=k) {
                ans+=a.length-r;
                freq.put(a[l], freq.get(a[l])-1);
                l++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1};
        int k = 3;
        System.out.println(countDominant(arr,k));
    }
}
