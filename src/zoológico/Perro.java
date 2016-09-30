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
public class Perro extends Canino implements Mascota, Superpoderes {

    @Override
    public void roam() {
        System.out.println("El perro está deambulando");
    }

    @Override
    public void eat() {
        System.out.println("El perro está comiendo");
    }
    
    

    @Override
    public void serAmigable() {
        System.out.println("El perro es amigable");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando");
    }
    
    @Override
    public void volar() {
        System.out.println("El perro está volando");
    }

    @Override
    public void serInvisible() {
        System.out.println("El perro es invisible");
    }

}
