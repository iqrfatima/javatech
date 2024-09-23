//to add to fraction
public class fracInOops {
    public static Fraction multi(Fraction f1,Fraction f2){
        int n = f1.num*f2.num;
        int d = f1.den*f2.den;
        Fraction f4 = new Fraction(n,d);
        return f4;
    }
    public static Fraction add(Fraction f1,Fraction f2){
        int n = f1.num*f2.den + f1.den*f2.num;
        int d = f1.den*f2.den;
        Fraction f3 = new Fraction(n,d);
        return f3;
    }
    public static Fraction sub(Fraction f1,Fraction f2){
        int n = f1.num*f2.den - f1.den*f2.num;
        int d = f1.den*f2.den;
        Fraction f5 = new Fraction(n, d);
        return f5;
    }
    public static Fraction div(Fraction f1, Fraction f2){
        int n  = f1.num*f2.den;
        int d = f1.den*f2.num;
        Fraction f6 = new Fraction(n, d);
        return f6;
    }
    public static int gcd(int num,int den){
        int min = Math.min(num,den);
        for(int i=min; i>=1; i--){
            if(num%i==0 && den%i==0)
            return i;
        }return min;
    }
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num,int den){
        this.num=num;
        this.den=den;
        
        }
        public void simplify(){
        int hcf=gcd(num,den);
        num/=hcf;
        den/=hcf;

        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(7,21);
        //f1.simplify();
        System.out.println("fraction 1");
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2 = new Fraction(4,16);
        System.out.println("fraction 2");
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3 = add(f1, f2);
        System.out.println("sum of fraction");
        System.out.println(f3.num+"/"+f3.den);
        System.out.println("product of fraction");
        Fraction f4 = multi(f1, f2);
        System.out.println(f4.num+"/"+f4.den);
        Fraction f5 = sub(f1, f2);
        System.out.println("difference of fraction");
        System.out.println(f5.num+"/"+f5.den);
        Fraction f6 = div(f1, f2);
        System.out.println("division of fraction");
        System.out.println(f6.num+"/"+f6.den);
    
        
    }
    
}
