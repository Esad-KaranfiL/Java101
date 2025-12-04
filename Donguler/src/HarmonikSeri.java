import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir pozitif tam sayı girin: ");
        int n = scanner.nextInt();

        double harmonikToplam = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonikToplam += 1.0 / i;
        }

        System.out.printf("Harmonik seri toplamı: " + harmonikToplam);
    }
}
