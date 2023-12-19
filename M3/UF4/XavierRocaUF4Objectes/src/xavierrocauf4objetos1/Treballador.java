/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Treballador {

    private String dni;
    private String nom;
    private String adreça;
    private double sou;

    public Treballador(String dni, String nom, String adreça, double sou) {
        this.dni = dni;
        this.nom = nom;
        this.adreça = adreça;
        this.sou = sou;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public void mostrarTreballadorFitxa(){
        System.out.printf("\nDNI: %s\nNom: %s\nAdreça: %s\nSou: %.2f\n", this.dni, this.nom, this.adreça, this.sou);
    }
    
    public void mostrarTaula(){        
        System.out.printf("%20s %20s %20s %20s", "DNI","NOM", "ADREÇA", "SOU");
    }
    
    public void mostrarTreballadorTaula(){
        System.out.printf("%20s %20s %20s %20.2f",this.dni, this.nom, this.adreça, this.sou);
    }
}
