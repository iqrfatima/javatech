public class subSequence {
    public static void sequence(String str,String newStr,int idx){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        sequence(str, newStr+currChar, idx+1);

        sequence(str, newStr, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        sequence(str, "", 0);

    }
    
}
