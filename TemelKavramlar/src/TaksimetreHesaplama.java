import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double taksimetreUcreti;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        taksimetreUcreti = (km * 2.20) + 10;

        if (taksimetreUcreti < 20) {
            taksimetreUcreti = 20;
        }

        System.out.print("Taksimetre Ücreti: " +  taksimetreUcreti);
    }
}
