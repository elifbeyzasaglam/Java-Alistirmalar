import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        System.out.println("sayi1 i giriniz: ");
        int sayi1 = login.nextInt();
        System.out.println("sayi2 yi giriniz");
        int sayi2 = login.nextInt();

        System.out.println("toplama için 1 :");
        System.out.println("çıkarma için 2 :");
        System.out.println("çarpma için 3 : ");
        System.out.println("bölme için 4 :");

        System.out.println("Yapmak istediğiniz işlem için bir numara giriniz: ");

        int secim = login.nextInt();
        switch (secim) {
            case 1:
                System.out.println("İşleminizin sonucu:" + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("işleminizin sonucu: " + Math.abs(sayi1 - sayi2));
                break;
            case 3:
                System.out.println("İşleminizin sonucu:" + sayi1 * sayi2);
                break;
            case 4:
                System.out.println("İşleminizin sonucu:" + (float) sayi1 / sayi2);
                break;

        }

    }
}
