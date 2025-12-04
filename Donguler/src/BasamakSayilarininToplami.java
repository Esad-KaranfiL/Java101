import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        while(sayi > 0){
            toplam += (sayi % 10);
            sayi = sayi/10;
        }
        System.out.print("Sayının basamak sayılarının toplamı : " + toplam);
    }
}
