


public class Main {

    
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap(2000, "Osman", "1234");
        atm.calis(hesap);
    }
    
}
