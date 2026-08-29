
import java.util.Arrays;

public class Longestprefix {
    public static void main(String[] args) {
        int i = 0;
        String[] str = {"flower","flight","flow"};
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
         System.out.println(first.substring(0,i));
    }
}
