import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();

            if(sayi % 4 == 0){
                toplam += sayi;
            }
            else if(sayi % 2 == 1){
                break;
            }
        }

        System.out.print("Toplam : "+toplam);
    }
}
