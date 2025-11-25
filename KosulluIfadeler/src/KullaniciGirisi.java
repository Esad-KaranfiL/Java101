import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, passwordInput;
        String password = "java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.next();

        System.out.print("Şifre: ");
        passwordInput = input.next();

        if (userName.equals("patika") && passwordInput.equals(password)) {
            System.out.println("Giriş Yaptınız !");
        } else {
            if (userName.equals("patika")) {
                System.out.println("Kullanıcı adı yanlış");
            } else {
                System.out.println("Şifre yanlış");
                System.out.println("Şifrenizi sıfılamak istemisiniz ? (Evet = e, Hayır = h)");

                if (input.next().equals("e")) {
                    System.out.println("Yeni şifreyi giriniz : ");
                    passwordInput = input.next();

                    if (!password.equals(passwordInput)) {
                        password = passwordInput;
                        System.out.println("Şifre oluşturuldu.");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
            }

        }
    }
}
