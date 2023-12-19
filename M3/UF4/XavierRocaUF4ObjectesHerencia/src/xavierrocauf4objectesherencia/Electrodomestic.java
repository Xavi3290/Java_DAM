/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Electrodomestic {

    private String marca;
    private double consum;
    private double pes;
    private double preuCompra;

    public Electrodomestic(String marca, double consum, double pes, double preuCompra) {
        this.marca = marca;
        this.consum = consum;
        this.pes = pes;
        this.preuCompra = preuCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getPreuCompra() {
        return preuCompra;
    }

    public void setPreuCompra(double preuCompra) {
        this.preuCompra = preuCompra;
    }

    public double getPreuVenda() {
        return this.preuCompra * 1.2;
    }    
    

    @Override
    public String toString() {
        return "Electrodomestic{" + "marca=" + marca + ", consum=" + consum + ", pes=" + pes + ", preuCompra=" + preuCompra + ", preuVenda= " + this.getPreuVenda() +'}';
    }
    

}
