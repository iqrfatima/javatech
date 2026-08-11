package GoldmanSachsAssi;
import java.util.*;
public class MaxProfit {
   
    public static int userLogic(List<Integer> nums) {
        int currentSum = 0;
        int maxProfit = 0;
        for(int i=0;i<nums.size();i++){
            currentSum = Math.max(nums.get(i), currentSum + nums.get(i));
            maxProfit = Math.max(maxProfit, currentSum);
        }
        return maxProfit; // Placeholder return value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int result = userLogic(nums);
        System.out.println(result);
    }
}

