
import java.util.Scanner;

public class IfElseYapısı {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int sayi1 = login.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int sayi2 = login.nextInt();


        System.out.println("toplama için 1 :");
        System.out.println("çıkarma için 2 :");
        System.out.println("çarpma için 3 : ");
        System.out.println("bölme için 4 :");

        System.out.println("Yapmak istediğiniz işlem için bir numara giriniz: ");
        int secim = login.nextInt();

        if (secim == 1) {
            System.out.println("İşleminizin sonucu: " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("İşleminizin sonucu : " + Math.abs(sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("İşleminizin sonucu " + sayi1 * sayi2);
        } else if (secim == 4) {
            System.out.println("İşleminizin sonucu : " + sayi1 / sayi2);
        } else {
            System.out.println("Yanlış seçim yaptınız ,tekrar deneyiniz ");
        }
    }
}
