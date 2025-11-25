import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double fiyat, kdvOran, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat: ");
        fiyat = input.nextDouble();

        if (fiyat > 1000) {
            kdvOran = 0.08;
        }
        else {
            kdvOran = 0.18;
        }

        kdvliTutar = (fiyat * kdvOran) + fiyat;

        System.out.println("KDV'li tutar : " + kdvliTutar);
    }
}
