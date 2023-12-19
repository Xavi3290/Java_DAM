/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public class Eso extends Alumne {

    public Eso(String nom, String dni) {
        super(nom, dni);
    }
    
   @Override
   public boolean pasaCurs(){
       boolean aprobat = true;
       if(this.getNotes()[2] >= 5){
           return aprobat;
       }else{
           aprobat = false;
           return aprobat;
       }
   }
   
   @Override
    public String toString() {
        return "Eso{" + super.toString() + "pasaCurs=" + this.pasaCurs() + '}';
    }
    
}
