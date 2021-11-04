
public class Hesap {
    private int bakiye;
    private String kullaniciadi;
    private String parola;

    public Hesap(int bakiye, String kullaniciadi, String parola) {
        this.bakiye = bakiye;
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
    }

    
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the kullaniciadi
     */
    public String getKullaniciadi() {
        return kullaniciadi;
    }

    /**
     * @param kullaniciadi the kullaniciadi to set
     */
    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
        
    
    }
    public void paraCek(int tutar){
        if (bakiye - tutar < 0) {
            System.out.println("Yetersiz bakiye");
        }
        
        else{bakiye -= tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }}
    
    
    
}
