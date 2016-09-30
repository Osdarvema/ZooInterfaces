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
public class Leon extends Felino implements Superpoderes{

    @Override
    public void volar() {
        System.out.println("El león está volando");
    }

    @Override
    public void serInvisible() {
        System.out.println("El león es invisible");
    }
    
}
