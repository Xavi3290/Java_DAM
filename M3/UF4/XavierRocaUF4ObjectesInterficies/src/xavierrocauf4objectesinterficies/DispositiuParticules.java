/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesinterficies;

/**
 *
 * @author usuari
 */
public class DispositiuParticules implements I_Activacio{
    
    private double particules;
    private String nom;
    private boolean onOff;

    public DispositiuParticules(double particules, String nom) {
        this.particules = particules;
        this.nom = nom;
    }

    public double getParticules() {
        return particules;
    }

    public void setParticules(double particules) {
        this.particules = particules;
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
        return "DispositiuParticules{" + "particules=" + particules + ", nom=" + nom + "onOff=" + onOff +'}';
    }
      
    @Override
    public void activar() {
        this.setOnOff(true);
    }

    @Override
    public double valor() {
         if(this.isOnOff()){
            return this.getParticules();
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
