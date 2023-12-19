/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4pe1;

/**
 *
 * @author usuari
 */
public class Mural extends Quadres {

    private int any;

    public Mural(int any, double alçada, double amplada, int codi, String nomAutor, String descripcio, double preu) {
        super(alçada, amplada, codi, nomAutor, descripcio, preu);
        this.any = any;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "Mural{" + super.toString() + "any=" + any + '}';
    }

    @Override
    public double getPreuVenda() {
        if (this.any < 1950) {
            return super.getPreu() * 1.2;
        } else {
            return super.getPreu() * 1.3;
        }
    }

    @Override
    public void dades() {
        System.out.printf("\nCodi = %d, Nom del Autor: %s, Preu: %.2f, Preu venda: %.2f, Alçada: %.2f, Amplada: %.2f, Any primera exposició: %d\nDescripció: %s\n", super.getCodi(), super.getNomAutor(), super.getPreu(), this.getPreuVenda(), super.getAlçada(), super.getAmplada(), this.getAny(), super.getDescripcio());
    }
}
