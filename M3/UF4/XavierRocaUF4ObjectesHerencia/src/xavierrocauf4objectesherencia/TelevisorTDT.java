/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class TelevisorTDT extends Televisor{
    
    private double potencia;

    public TelevisorTDT(double potencia, double polsades, String marca, double consum, double pes, double preuCompra) {
        super(polsades, marca, consum, pes, preuCompra);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "TelevisorTDT{"+ super.toString() + "potencia=" + potencia + '}';
    }
    
}
