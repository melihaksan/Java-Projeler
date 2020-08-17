
import java.util.Scanner;

// İç içe For döngüsü kullanarak çarpım tablosu oluşturma...
public class Main {
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("**********************");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            
            }
            System.out.println("***********************");
            
        }
    }
    
}
