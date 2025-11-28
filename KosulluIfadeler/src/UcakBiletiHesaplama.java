import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int yas, mesafe, yolculukTipi;
        double tutar , yasIndirimOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        yasIndirimOrani = 1;
        if (yas < 12 ) {
            yasIndirimOrani = 0.5;
        }else if (yas > 12 && yas < 24) {
            yasIndirimOrani = 0.9;
        }else if (yas > 65) {
            yasIndirimOrani = 0.7;
        }

        if (yolculukTipi == 1) {
            tutar = (mesafe * 0.1) * yasIndirimOrani;
            System.out.println("Toplam tutar = " + tutar);
        }
        else if (yolculukTipi == 2) {
            tutar = (((mesafe * 0.1) * yasIndirimOrani) * 0.8) * 2;
            System.out.println("Toplam tutar = " + tutar);
        }else {
            System.out.println("Hatalı veri girdiniz !");
        }

    }
}
