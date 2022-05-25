
import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz -kg- :");
        float kg = login.nextFloat();
        System.out.println("Boyunuzu giriniz -m- :");
        float boy = login.nextFloat();
        float index = kg / (boy * boy);
        System.out.println("Boy kilo indeksiniz:" + index);


        if (index < 18) {
            System.out.println("Zayıf");
        } else if (index < 25) {
            System.out.println("Normal");
        } else if (index < 30) {
            System.out.println("Hafif Şişman");
        } else if (index < 35) {
            System.out.println("Şişman");
        } else {
            System.out.println("Obez");
        }


    }
}
