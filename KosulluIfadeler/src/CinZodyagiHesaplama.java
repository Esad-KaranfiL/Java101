import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int yil = scanner.nextInt();

        int mod = yil % 12;

        if (mod == 0) {
            System.out.println("Çin zodyağı burcunuz: Maymun");
        } else if (mod == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        } else if (mod == 2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        } else if (mod == 3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        } else if (mod == 4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        } else if (mod == 5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        } else if (mod == 6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        } else if (mod == 7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        } else if (mod == 8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        } else if (mod == 9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        } else if (mod == 10) {
            System.out.println("Çin zodyağı burcunuz: At");
        } else if (mod == 11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }

    }
}
