import java.util.Scanner;

public class DikdortgenAlanCevre {

    public static void main(String[] args) {
        System.out.println("uzun kenarı girin:");
        System.out.println("kısa kenarı girin:");
        Scanner giris = new Scanner(System.in);
        int uzunkenar = giris.nextInt();
        int kisakenar = giris.nextInt();

        int alan = kisakenar * uzunkenar;
        int cevre = 2 * (kisakenar + uzunkenar);
        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}
