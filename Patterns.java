class Patterns {
    public static void pattern1(int n){
        System.out.println("pattern1");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        System.out.println("pattern2");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    public static void pattern3(int n){
        System.out.println("pattern3");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
        public static void pattern4(int n) {
        System.out.println("pattern4");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }

    public static void pattern5(int n) {
        System.out.println("pattern5");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("pattern6");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        n = 65;
        System.out.println("pattern7");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(n-1+i)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n) {
        n = 65;
        System.out.println("pattern8");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(n-1+j)+" ");
            }
            System.out.println();
        }    
    }

    public static void pattern9(int n) {
        int m = 65;
        System.out.println("pattern9");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(m-1+i)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n) {
        int m = 65;
        System.out.println("pattern10");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(m-1+j)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for (int j = 1; j <= i; j++) {
            //     System.out.print("*");
            // }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            if((i=1 && j=1))
                System.out.print(5* +'*');
        }
    }


    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
    }    
}
