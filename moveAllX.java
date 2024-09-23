
public class moveAllX {
    public static void moveAll(String str,int idx,int count,String newStr){
     if(idx==str.length()){
        for(int i=0;i<count;i++)
        newStr+='x';

        System.out.println(newStr);
        return;
     }
     char currChar =str.charAt(idx);
     if(currChar=='x'){
        count++;
        moveAll(str, idx+1, count, newStr);
     }else{
        newStr+=currChar;
        moveAll(str, idx+1, count, newStr);
     }
    }

    public static void main(String args[]){
        String str = "axbcxxd";
        moveAll(str, 0, 0, "");
    } 
    
}
