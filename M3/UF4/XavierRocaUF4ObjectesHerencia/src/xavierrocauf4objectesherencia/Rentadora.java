/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Rentadora extends Electrodomestic {
    
    private double carrega;

    public Rentadora(double carrega, String marca, double consum, double pes, double preuCompra) {
        super(marca, consum, pes, preuCompra);
        this.carrega = carrega;
    }

    public double getCarrega() {
        return carrega;
    }

    public void setCarrega(double carrega) {
        this.carrega = carrega;
    }
    
    public double getPreuVenda() {
        if(this.carrega > 5){
            return Rentadora.super.getPreuCompra() * 1.3;
        }else{
            return super.getPreuVenda();
        }
        
    }

    @Override
    public String toString() {
        return "Rentadora{"+ super.toString() + "carrega=" + carrega + '}';
    }
    
        
}
