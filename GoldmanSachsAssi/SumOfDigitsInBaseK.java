package GoldmanSachsAssi;

public class SumOfDigitsInBaseK {
    public static int sumBase(int n, int k) {
        int sum = 0;
        while(n!=0){
            sum = n % k;
            n/=k;
        }
        return sum; // placeholder return
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = sumBase(n, k);
        System.out.println(result);
    }
}

