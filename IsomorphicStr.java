import java.util.HashMap;

public class IsomorphicStr {
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> m = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), t.charAt(i));
            }
            else{
                if(m.get(s.charAt(i)) == t.charAt(i))
                    return true;
            }
                
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "f11";
        String t = "b23";
        System.out.println(isIsomorphic(s, t));
    }
}
