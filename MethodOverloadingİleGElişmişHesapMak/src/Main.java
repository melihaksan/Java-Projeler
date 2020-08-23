
import java.util.Scanner;


public class Main {
    public static int çıkarma(int a ,int b) {
        return (a - b);
    }
    public static double bölme(int a,int b){
        return ((double)a / b);
    }
    public static int toplama(int a,int b){
        return (a+b);
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
   public static int çarpma(int a,int b){
       return (a*b);
   }
   public static int çarpma(int a,int b,int c){
       return (a*b*c);
   }
    
   
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       String islemler = "1. Çıkarma İşlemi\n"+
                          "2. Bölme İşlemi\n "+
                         "3. Toplama İşlemi\n"+
                          "4. Çarpma İşlemi\n"+
                          "Çıkış için q'ya Basınız";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");
         
        while (true) {           
            System.out.print("İşlem Seçiniz =  ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("3")) {
                System.out.println("Kaç Değer Toplayacaksınız? (2 veya 3)= " );
                int kacsayi = scanner.nextInt();
               
                if (kacsayi == 2) {
                    System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayıların Toplamı = " + toplama(a, b));
                }
                else if (kacsayi == 3) {
                    System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    System.out.print("c :");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen Sayıların Toplamı =" + toplama(a, b, c));
                }
                else {
                    System.out.print("Bunun için uygu Method Bulunmuyor!");
                }
            }
            else if (islem.equals("1")) {
                System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayıların Farkları = " + çıkarma(a, b));
                
            }
            else if (islem.equals("4")) {
                System.out.print("Kaç Değer Toplayacaksınız? (2 veya 3)= " );
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayıların Çarpımı =  " + çarpma(a, b));
                }
            
                else if (kacsayi == 3) {
                    System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    System.out.print("c :");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayıların Çarpımı =  " + çarpma(a, b, c));
                    
                    }
                else {
                    System.out.println("Bunun için uygun method Bulunmuyor!");
                }
                   }
            else if (islem.equals("2")) {
                System.out.print("a :");
                    int a = scanner.nextInt();
                    System.out.print("b :");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların Bölümü = " + bölme(a, b));
            }
            }
   }
}
   
    

        
