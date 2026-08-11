package array_dsa;

import java.util.Arrays;
public class rearrangeArray {
    static int[] rearrange(int nums[]){
        int l = nums.length;
        int[] arr = new int[l];
        int p=0;
        int n=1;
        if(nums.length%2!=0)
        return null;
        for(int i : nums){
            if(i>0){
                arr[p] = i;
                p+=2;
            }else{
                arr[n] = i;
                n+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {2,8,-1,4,-5,-6};
        // System.out.println(rearrange(nums));
        System.out.println(Arrays.toString(rearrange(nums)));
    }
}
