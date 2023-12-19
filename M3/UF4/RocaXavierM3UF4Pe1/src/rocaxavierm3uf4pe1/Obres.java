/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4pe1;

/**
 *
 * @author usuari
 */
public abstract class Obres {

    private int codi;
    private String nomAutor;
    private String descripcio;
    private double preu;

    public Obres(int codi, String nomAutor, String descripcio, double preu) {
        this.codi = codi;
        this.nomAutor = nomAutor;
        this.descripcio = descripcio;
        this.preu = preu;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPreuVenda() {    // Se tiene que hacer abstract
        return preu;
    }

    @Override
    public String toString() {
        return "Obres{" + "codi=" + codi + ", nomAutor=" + nomAutor + ", descripcio=" + descripcio + ", preu=" + preu + '}';
    }

    public void dades() {
        System.out.printf("\nCodi = %d, Nom del Autor: %s, Preu: %.2f\nDescripció: %s\n", this.codi, this.nomAutor, this.preu, this.descripcio);
    }

}
