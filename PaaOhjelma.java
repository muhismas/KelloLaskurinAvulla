
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class PaaOhjelma {
    public static void main(String[] args) throws InterruptedException {
        Scanner lukija = new Scanner (System.in);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        
        System.out.println("Sekunnit: ");
        int sek = Integer.parseInt(lukija.nextLine());
        System.out.println("Minuutit: ");
        int min = Integer.parseInt(lukija.nextLine());
        System.out.println("Tunnit: ");
        int tun = Integer.parseInt(lukija.nextLine());
        
        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);
        
        int i=0;
        while (i<121) {
            System.out.println(tunnit+":"+minuutit+":"+sekunnit);
            Thread.sleep(1000);
            sekunnit.seuraava();
            if (sekunnit.arvo() == 0) {
                minuutit.seuraava();
                if (minuutit.arvo() == 0) {
                tunnit.seuraava();
            }
            }
            i++;
        }
        
    }
}
