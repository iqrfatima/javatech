public class revst {
    public static void rev(int n,String c){
        if(n==1){
            System.out.println(c.charAt(0));
            return;
        }
        System.out.println(c.charAt(n));
        rev(n-1, c);
    }
    public static void main(String[] args){
        String c="abcd";
        int n = c.length();
        rev(n, c);


    }
    
}
