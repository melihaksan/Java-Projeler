
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("Melih Bank'a Hoşgeldiniz. Hesap İşlemleri");
        String islemler = "1. İşlem: Bakiye Öğrenme\n"+
                          "2. İşlem: Para Çekme\n"+
                          "3. İşlem: Para Yatırma\n"+
                          "4. İşlem: Çıkış için q tuşuna basınız";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        
        while (true) {
            System.out.println("İşlemi Seçiniz");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
                
            }
            else if (islem.equals("2")) {
                System.out.print("Çekmek İstediğiniz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli Bakiye Yok...  Bakiyeniz"+bakiye); 
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye);
                }
                
            }
            else if (islem.equals("3")) {
                System.out.print("Yatırmak İstediğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
               
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz:" + bakiye);
            }
            else {
                System.out.println("Geçersiz İşlem");
            }
            
        }
    }
    
}
