/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public class Batxillerat extends Alumne {

    public Batxillerat(String nom, String dni) {
        super(nom, dni);
    }

   @Override
   public boolean pasaCurs(){
      boolean aprobat = true;
      double resu;
      double suma = 0;
          for (int i = 0; i < this.getNotes().length; i++) {
              suma = suma + this.getNotes()[i];
          }
          resu = suma / 3;
          if(resu >= 5){
              return aprobat;
          }else{
              aprobat = false;
              return aprobat;
          }
   }    
   
   @Override
    public String toString() {
        return "Batxillerat{" + super.toString() + "pasaCurs=" + this.pasaCurs() + '}';
    }
}
