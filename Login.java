
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kullanici adini giriniz : ");
        String kullanici_adi = scanner.nextLine();
        System.out.print("Lütfen parola giriniz : ");
        String parola = scanner.nextLine();
        
        
        if (kullanici_adi.equals(hesap.getKullaniciadi()) && parola.equals(hesap.getParola())) {
           return true;
            
        }
        
        return false;
    
    
    }
}
