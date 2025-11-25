import  java.util.Scanner;

public class UcgeninAlanı {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("A kenarının uzunluğu : ");
        a = input.nextInt();

        System.out.print("B kenarının uzunluğu : ");
        b = input.nextInt();

        System.out.print("C kenarının uzunuğu : ");
        c = input.nextInt();

        u = (a + b + c) / 2.0;

        alan = Math.sqrt(u *  (u - a) * (u - b) * (u - c));

        System.out.print("Üçgenin Alanı : " + alan);
    }
}
