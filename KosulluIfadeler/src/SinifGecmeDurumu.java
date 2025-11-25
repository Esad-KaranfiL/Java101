import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        mat = mat >= 0 && 100 >= mat ? mat: 0;
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        fizik = fizik >= 0 && 100 >= fizik ? fizik: 0;
        System.out.print("Türkce notunuz: ");
        turkce = input.nextInt();
        turkce = turkce >= 0 && 100 >= turkce ? turkce: 0;
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        kimya = kimya >= 0 && 100 >= kimya ? kimya: 0;
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        muzik =  muzik >= 0 && 100 >= muzik ? muzik: 0;

        double ortalama = (double) (mat + fizik + turkce + kimya + muzik) / 5;

        System.out.println("Ortalama: " + ortalama);
    }
}
