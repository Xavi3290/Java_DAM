/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuari
 */
public class Coche {

    private String matricula;
    private String marca;
    private int preu;
    private Propietari propietario;

    public Coche(String matricula, String marca, int preu, Propietari propietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.preu = preu;
        this.propietario = propietario;
    }
    
    public Coche(){
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public Propietari getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietari propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", preu=" + preu + ", propietario=" + propietario + '}';
    }

  

}
