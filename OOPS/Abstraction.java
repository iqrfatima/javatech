abstract class Animal{
    public abstract void sounds(); 
}
public class Abstraction extends Animal{
    public void sounds(){
        System.out.println("meow..");
    }
    public static void main(String[] args) {
    Abstraction a  = new Abstraction();
    a.sounds();
   }
}
