/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoológico;

/**
 *
 * @author DAVID
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato g = new Gato();
        g.jugar();
        g.roam();
        g.serInvisible();
        g.volar();
        Perro p = new Perro();
        p.volar();
        Leon l = new Leon();
        l.serInvisible();
        
    }
    
}
