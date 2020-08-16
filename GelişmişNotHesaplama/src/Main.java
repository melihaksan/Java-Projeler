
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vize1 ");
        int vize1 = scanner.nextInt();
        System.out.println("Vize2 ");
        int vize2 = scanner.nextInt();
        System.out.println("Final Notu ");
        int finalnot = scanner.nextInt();
        
        double toplamnot = ((vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0));
        
        if (toplamnot >= 90) {
            System.out.println("AA geçtiniz...");    
        }
        
        else if (toplamnot >= 85 ){
                 System.out.println("BA geçtiniz...");
                }
        else if (toplamnot >= 80){
            System.out.println("BB geçtiniz...");
        }
        else if (toplamnot >= 75){
            System.out.println("BC geçtiniz...");
        }
        else if (toplamnot >= 65){
            System.out.println("DC geçtiniz...");
        }
        else if (toplamnot >= 60){
            System.out.println("DD geçtiniz...");
        }
        else if (toplamnot >= 55){
            System.out.println("FD kaldınız...");
            
        }
        else {
            System.out.println("FF aldınız ve kaldınız...");
        }
            
    }
}
  