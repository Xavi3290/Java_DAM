/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4pe1;

/**
 *
 * @author usuari
 */
public class Escultura extends Obres {

    private String material;

    public Escultura(String material, int codi, String nomAutor, String descripcio, double preu) {
        super(codi, nomAutor, descripcio, preu);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Escultura{" + super.toString() + "material=" + material + '}';
    }

    @Override
    public double getPreuVenda() {
        return super.getPreu() * 1.05;
    }

    @Override
    public void dades() {
        System.out.printf("\nCodi = %d, Nom del Autor: %s, Preu: %.2f, Preu venda: %.2f, Material: %s\nDescripció: %s\n", super.getCodi(), super.getNomAutor(), super.getPreu(), this.getPreuVenda(), this.getMaterial(), super.getDescripcio());
    }
}
