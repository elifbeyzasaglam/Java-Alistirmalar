
import java.sql.SQLOutput;
import java.util.Scanner;

public class IkiSayıyıKarsilastirma {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("sayı biri girin:");
        int sayi1 = login.nextInt();
        System.out.println("sayı ikiyi girin:");
        int sayi2 = login.nextInt();

        if (sayi1 < sayi2) {
            System.out.println("sayı2 , sayi1 den büyüktür");
        } else if (sayi1 > sayi2) {
            System.out.println("sayi1 sayi2 den  büyüktür");
        } else {
            System.out.println("sayılar eşittir");
        }
    }
}
