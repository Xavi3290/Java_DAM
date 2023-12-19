/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Treballador extends Persona{
     /** sou del treballador */
    private float sou;// sou del treballador
    
    
    /* retorna un objecte Treballador passat els seus atributs */
    public Treballador(String nom, String dni, String adreça, float sou) {
        super(nom, dni, adreça);
        this.sou = sou;
    }

   public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }

    
    @Override
    public String dades() {
        return "Treballador: {" + super.dades() + ",sou=" + sou+ "}";
    }
}
