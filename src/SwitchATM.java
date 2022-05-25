import java.util.Scanner;

public class SwitchATM {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        int bakiye = 1000;
        System.out.println("Bakiyeniz:" + bakiye);
        System.out.println("/n**********İşleminizi seçiniz**********/n");

        System.out.println("1. para çekmek ");
        System.out.println("2. para yatırmak ");
        System.out.println("3. bakiye sorgulama");
        System.out.println("4. kart iade:");

        int islem = login.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz :" + bakiye);
                System.out.println("çekmek istediğiniz tutarı giriniz:");
                int tutar = login.nextInt();
                if (bakiye < tutar) {
                    System.out.println("yetersiz bakiye , tekrar deneyiniz");
                    tutar = login.nextInt();
                }
                bakiye -= tutar;
                System.out.println("yeni bakiyeniz:" + bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz: " + bakiye);
                System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                tutar = login.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz:=" + bakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz:" + bakiye);
                break;
            case 4:
                System.out.println("kartınızı almayı unutmayınız!!");
                break;
            default:
                System.out.println("yanlış işlem lütfen tekrar deneyeiniz!");


        }
    }
}
