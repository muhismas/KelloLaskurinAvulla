/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Kello {
    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnit, int minuutit, int sekunnit) {
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        this.tunnit.asetaArvo(tunnit);
        this.minuutit.asetaArvo(minuutit);
        this.sekunnit.asetaArvo(sekunnit);
    }

    
    
    public void etene() {
        this.sekunnit.seuraava();
        if (this.sekunnit.arvo() == 0) {
            this.minuutit.seuraava();
            if(this.minuutit.arvo() == 0) {
                this.tunnit.seuraava();
            }
        }
    }

    @Override
    public String toString() {
        return  tunnit + ":" + minuutit + ":" + sekunnit + '}';
    }
    
    
}
