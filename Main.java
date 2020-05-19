/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Main {
    public static void main(String[] args) {
        Kello kello = new Kello(23, 59, 50);
        
        int i=0;
        while (i<20) {
            System.out.println(kello);
            kello.etene();
            i++;
        }
    }
}
