/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

/**
 *
 * @author usuari
 */
public class Professor extends Persona{
    private String numCompte;

    public Professor(String numCompte, String nom, String dni) {
        super(nom, dni);
        this.numCompte = numCompte;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + "numCompte=" + numCompte + '}';
    }
}
