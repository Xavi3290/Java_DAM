/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Televisor extends Electrodomestic {
     
    private double polsades;

    public Televisor(double polsades, String marca, double consum, double pes, double preuCompra) {
        super(marca, consum, pes, preuCompra);
        this.polsades = polsades;
    }
    
    public double getPolsades() {
        return polsades;
    }

    public void setPolsades(double polsades) {
        this.polsades = polsades;
    }

    public double getPreuVenda() {
        if(this.polsades > 40){
            return Televisor.super.getPreuCompra() * 1.3;
        }else{
            return super.getPreuVenda();
        }
        
    }

    @Override
    public String toString() {
        return "Televisor{"+ super.toString() + "polsades=" + polsades + '}';
    }
    
    
}
