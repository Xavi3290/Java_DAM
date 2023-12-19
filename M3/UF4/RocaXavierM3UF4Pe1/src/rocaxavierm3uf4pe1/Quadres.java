/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4pe1;

/**
 *
 * @author usuari
 */
public class Quadres extends Obres {

    private double alçada;
    private double amplada;

    public Quadres(double alçada, double amplada, int codi, String nomAutor, String descripcio, double preu) {
        super(codi, nomAutor, descripcio, preu);
        this.alçada = alçada;
        this.amplada = amplada;
    }

    public double getAlçada() {
        return alçada;
    }

    public void setAlçada(double alçada) {
        this.alçada = alçada;
    }

    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }

    @Override
    public String toString() {
        return "Quadres{" + super.toString() + "alçadada=" + alçada + ", amplada=" + amplada + '}';
    }

    @Override
    public double getPreuVenda() {
        return super.getPreu() * 1.1;
    }

    @Override
    public void dades() {
        System.out.printf("\nCodi = %d, Nom del Autor: %s, Preu: %.2f, Preu venda: %.2f, Alçada: %.2f, Amplada: %.2f\nDescripció: %s\n", super.getCodi(), super.getNomAutor(), super.getPreu(), this.getPreuVenda(), this.alçada, this.amplada, super.getDescripcio());
    }

}
