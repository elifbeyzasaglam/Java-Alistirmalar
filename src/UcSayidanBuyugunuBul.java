
import java.util.Scanner;
public class UcSayidanBuyugunuBul {
    public static void main (String []args){
        Scanner login = new Scanner(System.in);
        System.out.println("sayi1 giriniz:");
        int sayi1 = login.nextInt();
        System.out.println("sayi2 giriniz:");
        int sayi2 = login.nextInt();
        System.out.println("sayı3 giriniz");
        int sayi3 = login.nextInt();

       int  buyukSayi= sayi1;
       if (sayi2>buyukSayi){
           buyukSayi = sayi2;
       }
       if(sayi3>buyukSayi){
           buyukSayi=sayi3;
       }
        System.out.println("En büyük Sayı : "+ buyukSayi);
    }
}
