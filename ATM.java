
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz....");

        System.out.println("***************");
        System.out.println("Kullanıcı girisi ");

        int girishakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giris basarili....");
                break;

            } else {
                System.out.println("Giris basarisiz");

                girishakki -= 1;

                System.out.println("Kalan giris hakki : " + girishakki);

            }

            if (girishakki == 0) {
                System.out.println("Giris hakkiniz bitti");
                return;

            }

        }

        System.out.println("***********************");
        String islem = "1. Bakiye görüntüle\n"
                + "2. Para yatirma\n"
                + "3. Para cekme\n"
                + "Cikis icin q ya basin";
        System.out.println("islemler");
        System.out.println("*******************");

        while (true) {
            System.out.print("Lütfen islem seciniz : ");
            islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Sistemden cikiliyor....");
                break;
            }
            
            else if (islem.equals("1")) {
                System.out.println(hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.print("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Gecersiz islem");
            }

        }

    }
}
