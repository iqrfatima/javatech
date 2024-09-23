import java.util.*;
public class occ {
    public static void findOcu(int idx,char element,String str){
        int first,last;
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            }
            else{
                last=idx;
            }
        }
        findOcu(idx+1, element, str);
    }
    public static void main(String[] args) {
        String str ="abaacdaefaah";
        findOcu(0, 'a', str);
        
    }
    
}
