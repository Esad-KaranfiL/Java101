import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc_name = "";
        boolean isError = false;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay :");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün :");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 20) {
                burc_name = "Oğlak";
            } else if (day >= 21 && day <= 31) {
                burc_name = "Kova";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                burc_name = "Kova";
            } else if (day >= 20 && day <= 29) {
                burc_name = "Balık";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                burc_name = "Balık";
            } else if (day >= 21 && day <= 31) {
                burc_name = "Koç";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                burc_name = "Koç";
            } else if (day >= 21 && day <= 30) {
                burc_name = "Boğa";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                burc_name = "Boğa";
            } else if (day >= 22 && day <= 31) {
                burc_name = "İkizler";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                burc_name = "İkizler";
            } else if (day >= 23 && day <= 30) {
                burc_name = "Yengeç";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                burc_name = "Yengeç";
            } else if (day >= 23 && day <= 31) {
                burc_name = "Aslan";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                burc_name = "Aslan";
            } else if (day >= 23 && day <= 31) {
                burc_name = "Başak";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                burc_name = "Başak";
            } else if (day >= 23 && day <= 30) {
                burc_name = "Terazi";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                burc_name = "Terazi";
            } else if (day >= 23 && day <= 31) {
                burc_name = "Akrep";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                burc_name = "Akrep";
            } else if (day >= 22 && day <= 30) {
                burc_name = "Yay";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                burc_name = "Yay";
            } else if (day >= 22 && day <= 31) {
                burc_name = "Oğlak";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError){
            System.out.print("Geçersiz ay veya gün girdiniz.");
        }
        else {
            System.out.print("Burcunuz : " + burc_name);
        }
    }
}
