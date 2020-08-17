
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertm
 */
public class Login {
    public static void main(String[] args) {
        // While Döngüsü ile kullanıcı giriş programı
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        String sys_kullanici_adi = "Melih Aksan";
        String sys_parola = "12345";
        System.out.println("**********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**********************");
        
        while (true) {
            System.out.println("Kullanıcı Adı: ");
            String kullanici_adi = scanner.nextLine();
            System.out.println("Parolayı Giriniz: ");
            String parola = scanner.nextLine();
            
            if (kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz...\n" + kullanici_adi);
                break;  
            }
            else if (kullanici_adi.equals(sys_kullanici_adi)&& !parola.equals(sys_parola)) {
                System.out.println("Parolanız Yanlış!");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            else if (!kullanici_adi.equals(sys_kullanici_adi)&& parola.equals(sys_parola)) {
                System.out.println("Kullanıcı Adınız Yanlış!");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            else {
                System.out.println("Kullanıcı Adınız veya Parolanız Yanlış!");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0 ) {
                System.out.println("Giriş Hakkınız Bitti. Program Sonlanıyor...");
                break;
            }
        }
        
        
        
        
        
    }
    
}
