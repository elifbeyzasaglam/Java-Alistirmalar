import java.util.Scanner;

public class VizeFinalNotu {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Vize notunuzu girin:");
        int vize = login.nextInt();
        System.out.println("final notunuzu girin:");
        int fınal = login.nextInt();


        double not = (vize * 0.4) + (fınal * 0.6);

        System.out.println("Not ortalamanız:" + not);

        if (not > 90) {
            System.out.println("AA ile geçtiniz");
        } else if (not > 85) {
            System.out.println("BA ile geçtiniz");
        } else if (not > 80) {
            System.out.println("BB ile geçtiniz");
        } else if (not > 75) {
            System.out.println("CB ile geçtiniz");
        } else if (not > 50) {
            System.out.println("Koşullu geçtiniz");
        } else {
            System.out.println("Maalesef kaldınız");
        }
    }
}
