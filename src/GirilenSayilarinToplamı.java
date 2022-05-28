import java.util.Scanner;
public class GirilenSayilarinToplamı {
    public static void main(String[]args){
        Scanner login = new Scanner(System.in);
        System.out.println("bir n sayısı giriniz:");
        int n = login.nextInt();
        int toplam =0;
        for(int i=1 ; i<=n; i++ ){
         toplam = i+toplam;
        }
        System.out.println("1 den n'e kadar sayıların toplamı:"+ toplam);
    }
}
