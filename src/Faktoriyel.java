import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n = login.nextInt();
        int fak = 1;
        for (int i = 1; i <= n; i++) {
            fak = i * fak;
        }
        System.out.println( n + "! =" + fak);
    }
}
