public class Alistirmalar {

    public static void main(String[] args) {
        degiskenDegeriniHariciDegiskenKullanmadanDegistirme();
    }

    public static void degiskenDegeriniHariciDegiskenKullanmadanDegistirme() {
        // x = 10 -> 5
        // y = 5  -> 10

        int x = 10;
        int y = 5;

        x = x + y; // x = 15      y = 5
        y = x - y; // x = 15      y = 10
        x = x - y; // x = 5       y = 10
    }

}