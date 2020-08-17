
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAyıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak SAyısı: ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        
        do {            
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
        } while (gecici_sayi > 0);
        if (sayi == toplam) {
            System.out.println("Bu Sayı Bir Armstrong Sayısıdır...");
            
        }
        else {
            System.out.println("Bu Sayı Bir Armstrong Sayısı Değildir!!!");
        }
        
    }
    
}
