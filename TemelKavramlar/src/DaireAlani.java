import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        double pi = 3.14, r, a, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Daire diliminin açısı: ");
        a = input.nextDouble();

        alan = (pi * (r*r) * a) / 360;
        System.out.print("Darire diliminin alanı: " + alan);
    }
}
