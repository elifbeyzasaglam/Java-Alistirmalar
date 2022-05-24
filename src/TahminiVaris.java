import java.util.Scanner;

public class TahminiVaris {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kaç km yol gitmek isiyorsunuz: ");
        int km = giris.nextInt();
        System.out.println("Kaç satte gitmek istiyorsunuz:");
        int saat = giris.nextInt();
        int varisSuresi = km / saat;

        System.out.println("tahmini varıs süreniz: " + varisSuresi);
    }

}
