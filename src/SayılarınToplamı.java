
public class SayılarınToplamı {
    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        for (i = 1; i < 100; i++) {

            toplam = toplam + i;
        }
        System.out.println("1-100 e kadar sayıların toplamı:" + toplam);
    }
}
