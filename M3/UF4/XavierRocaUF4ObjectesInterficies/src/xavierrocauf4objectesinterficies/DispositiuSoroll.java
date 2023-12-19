/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesinterficies;

/**
 *
 * @author usuari
 */
public class DispositiuSoroll implements I_Activacio{
    
    private double soroll;
    private String nom;
    private boolean onOff;

    public DispositiuSoroll(double soroll, String nom) {
        this.soroll = soroll;
        this.nom = nom;
    }

    public double getSoroll() {
        return soroll;
    }

    public void setSoroll(double soroll) {
        this.soroll = soroll;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "DispositiuSoroll{" + "soroll=" + soroll + ", nom=" + nom + "onOff=" + onOff +'}';
    }      

    @Override
    public void activar() {
        this.setOnOff(true);
    }

    @Override
    public double valor() {
        if(this.isOnOff()){
            return this.getSoroll();
        }else
            return 0;
    }

    @Override
    public void desactivar() {
        this.setOnOff(false);
    }

    @Override
    public void dades() {
        System.out.println(this.toString());
    }
    
    
}
