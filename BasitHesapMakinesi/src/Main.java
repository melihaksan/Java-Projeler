
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********************************");
        String islemler = "1. Toplama\n"
                          +"2. Çıkarma\n"
                          +"3. Çarpma\n"
                          +"4. Bölme";
        System.out.println(islemler);
        System.out.println("**********************************");
        System.out.println("İşlemi Seçiniz");
        String islem = scanner.nextLine();
        
        int a;
        int b;
        
        
        switch(islem){
            case "1":
                System.out.println("1. Sayı");
                a = scanner.nextInt();
                System.out.println("2. Sayı");
                b = scanner.nextInt();
                System.out.println("Sayıların Toplamı = " + (a + b));
                break;
            case "2":
                System.out.println("1. Sayı");
                a = scanner.nextInt();
                System.out.println("2. Sayı");
                b = scanner.nextInt();
                System.out.println("Sayıların Çıkarımı = " + (a - b));
                break;
            case "3":
                System.out.println("1. Sayı");
                a = scanner.nextInt();
                System.out.println("2. Sayı");
                b = scanner.nextInt();
                System.out.println("Sayıların Çarpımı = " + (a * b));
                break;
            case "4":
                System.out.println("1. Sayı");
                a = scanner.nextInt();
                System.out.println("2. Sayı");
                b = scanner.nextInt();
                System.out.println("Sayıların Bölümü = " + ((double)a / b));
                break;  
            default:
                System.out.println("Geçersiz İşlem!!!");
 
        }
        
        
        
        

    }
    
}
