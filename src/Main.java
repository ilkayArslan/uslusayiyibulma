import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üssü alınacak sayıyı giriniz : ");
        int base = input.nextInt();
        System.out.print("Lütfen üs kuvvetini giriniz : ");
        int up = input.nextInt();
        long result=1;
        for (int i = 1;i<=up;i++){
            result*=base;
        }
        System.out.print(base+" sayısının "+up+" üssü : "+ result );
    }
}