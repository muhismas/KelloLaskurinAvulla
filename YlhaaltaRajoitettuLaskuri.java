/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri (int ylarajanAlkuarvo) {
        this.ylaraja = ylarajanAlkuarvo;
    }
    
    public void seuraava () {
        this.arvo++;
        if(this.arvo > ylaraja) {
            this.arvo = 0;
        }
    }
    
    public String toString () {
        if (this.arvo < 10) {
            return "0"+this.arvo ;
        }
        else {
            return ""+this.arvo;}
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void asetaArvo(int arvo) {
        this.arvo = arvo;
    }
}
