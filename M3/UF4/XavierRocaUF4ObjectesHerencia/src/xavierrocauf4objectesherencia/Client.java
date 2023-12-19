/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Client extends Persona{
    
    private int numCompte;
    private double total;

    public Client(int numCompte, String nom, String dni, String adreça) {
        super(nom, dni, adreça);
        this.numCompte = numCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String dades() {
        return "Client{" + super.dades() + "numCompte=" + numCompte + ", total=" + total + '}';
    }
    
    
    
}
