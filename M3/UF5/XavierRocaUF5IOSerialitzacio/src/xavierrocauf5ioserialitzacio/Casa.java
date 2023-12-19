/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.Serializable;

/**
 *
 * @author usuari
 */
public class Casa implements Serializable {
    
    private String carrer;
    private String ciutat;
    private int numInquilins;
    private Propietari prop;

    public Casa(String carrer, String ciutat, int numInquilins, Propietari prop) {
        this.carrer = carrer;
        this.ciutat = ciutat;
        this.numInquilins = numInquilins;
        this.prop = prop;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public int getNumInquilins() {
        return numInquilins;
    }

    public void setNumInquilins(int numInquilins) {
        this.numInquilins = numInquilins;
    }

    public Propietari getProp() {
        return prop;
    }

    public void setProp(Propietari prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Casa{" + "carrer=" + carrer + ", ciutat=" + ciutat + ", numInquilins=" + numInquilins + ", prop=" + prop + '}';
    }

   

    
    
}
