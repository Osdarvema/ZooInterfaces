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
public class Gato extends Felino implements Mascota, Superpoderes {

    @Override
    public void roam() {
        System.out.println("El gato está deambulando");

    }

    @Override
    public void eat() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void serAmigable() {
        System.out.println("El gato es amigable");
    }

    @Override
    public void jugar() {
        System.out.println("El gato está jugando");
    }

    @Override
    public void volar() {
        System.out.println("El gato está volando");
    }

    @Override
    public void serInvisible() {
        System.out.println("El gato es invisible");
    }
}
