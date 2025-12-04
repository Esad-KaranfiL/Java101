import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        long faktoriyelN = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyelN *= i;
        }

        long faktoriyelR = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyelR *= i;
        }

        long faktoriyelNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            faktoriyelNR *= i;
        }

        long kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }


}
