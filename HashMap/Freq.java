package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Freq {
    public static void main(String args[]){
        Map<Integer,Integer> freq = new HashMap<>();
        int arr[] = {1,4,6,1,8,4,4,4,2,6,8,9,0,1};
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int mx=0;
        for(int f:freq.keySet()){
            if(freq.get(f)>mx)
            mx = freq.get(f);
        }
        System.out.println("max frequency is"+mx);

    }
}
