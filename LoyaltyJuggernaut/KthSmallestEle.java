package LoyaltyJuggernaut;

import java.util.Collections;
import java.util.PriorityQueue;

//can also be done Array.sort(arr) mthd and sorting techniques
//using Heap
public class KthSmallestEle {
    static int smallestEle(int arr[] , int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : arr){
            maxHeap.add(n);
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {2,6,1,8,4};
        int k = 2;
        System.out.println(smallestEle(arr,k));
    }
    
}
