
import java.util.Scanner;

public class Bank {

    public Bank() {
    }
    int notes[] = {20,50,100,200,500};
    public static void deposit(int count[]){
        for (int i = 0; i < 5; i++) {
            int amt +=(count[i] * notes[i])
        }
        
    }
    public static int withDraw(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Select deposit & withdraw");
        switch (choice) {
            case 1:
            deposit(count);
            break;
            case 2:
                int p = withDraw();
                break;

            default:
                System.out.println("Wrong choice");
}
        int count[5] = new int[5];
        System.out.println("enter the notes count in order {20,50,100,200,500} ");
        for(int i =0;i<5;i++){
            count = sc.nextInt();
        }
    }
}
