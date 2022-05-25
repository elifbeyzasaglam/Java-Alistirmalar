import java.util.Scanner;

public class GirilenSayiyiOkuma {
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        System.out.println("iki basamaklı bir sayı giriniz:");
        int sayi = login.nextInt();

        int birler = sayi % 10;
        int onlar = sayi / 10;

        switch (onlar) {
            case 1:
                System.out.print(" on ");
                break;
            case 2:
                System.out.print(" yirmi ");
                break;
            case 3:
                System.out.print(" otuz ");
                break;
            case 4:
                System.out.print(" kırk ");
                break;
            case 5:
                System.out.print(" elli ");
                break;
            case 6:
                System.out.print(" atmış ");
                break;
            case 7:
                System.out.print(" yetmiş ");
                break;
            case 8:
                System.out.print(" seksen ");
                break;
            case 9:
                System.out.print(" doksan ");
                break;
        }
        switch (birler) {
            case 1:
                System.out.print(" bir ");
                break;
            case 2:
                System.out.print(" iki ");
                break;
            case 3:
                System.out.print(" üç ");
                break;
            case 4:
                System.out.print(" dört ");
                break;
            case 5:
                System.out.print(" beş ");
                break;
            case 6:
                System.out.print(" altı ");
                break;
            case 7:
                System.out.print(" yedi ");
                break;
            case 8:
                System.out.print(" sekiz ");
                break;
            case 9:
                System.out.print(" dokuz ");
                break;
        }


    }
}
