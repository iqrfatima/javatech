// subarray sum to given k 

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
    public static int subArraySum(int nums[],int k){
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0, 1);
        for (int i : nums) {
            sum+=i;
            if(m.containsKey(sum-k)){
                count += m.get(sum-k);
            }
            m.put(sum,m.getOrDefault(sum, 0)+1);
            
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {8,2,3,4,1};
        System.out.println(subArraySum(a,12)); 
    }
}
