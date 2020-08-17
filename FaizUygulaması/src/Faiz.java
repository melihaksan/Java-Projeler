
import java.awt.BorderLayout;
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
public class Faiz {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği 
        bilgisini alır ve her sene sonunda toplam parasını ekrana yazdırır...
        
        Faiz oranı : %6
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz... Faiz Oranımız %6");
        System.out.println("******************************************");
        int anapara,vade;
        
        System.out.println("Yatırmak İstediğiniz Tutar: ");
        anapara = scanner.nextInt();
        System.out.println("Paranızı Kaç Yıl Vade ile Yatırmak istersiniz?");
        vade = scanner.nextInt();
        
        double toplam_para = anapara;
        double faiz_orani = 0.06;
        
        for (int i = 1; i < vade; i++) {
            toplam_para = (toplam_para * faiz_orani+ toplam_para);
            System.out.println(i + ".Yılın Sonunda Toplam Para" + toplam_para);
        }
        
        
        
    }
    
}
