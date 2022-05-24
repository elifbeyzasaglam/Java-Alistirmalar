import java.util.Scanner;

public class KDVliUrunFiyati {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("ürünün kdv'siz fiyatını giriniz");
        int fiyat1 = giris.nextInt();

        double fiyat2 = fiyat1 + (fiyat1 * 0.18);
        System.out.println("ürünün yeni fiyatı : " + fiyat2);
    }

}
