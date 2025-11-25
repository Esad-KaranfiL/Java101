import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double kilo;
        double toplamFiyat;

        Scanner input = new Scanner(System.in);
        toplamFiyat = 0;

        System.out.print("Armut Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplamFiyat += kilo * armut;

        System.out.print("Elma Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplamFiyat += kilo * elma;

        System.out.print("Domates Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplamFiyat += kilo * domates;

        System.out.print("Muz Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplamFiyat += kilo * muz;

        System.out.print("Patlıcan Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplamFiyat += kilo * patlican;

        System.out.print("Toplam Tutar : " +  toplamFiyat + " TL");

    }
}
