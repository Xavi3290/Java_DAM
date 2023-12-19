/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objectesinterficies;

/**
 *
 * @author usuari
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa e = new Empresa("CorteIngles");
        DispositiuParticules dp = new DispositiuParticules(5,"Particules");
        DispositiuParticules dp2 = new DispositiuParticules(10,"Particules2");
        DispositiuSoroll ds = new DispositiuSoroll(3,"Soroll");
        DispositiuSoroll ds2 = new DispositiuSoroll(6,"Soroll2");
        
        e.afegirDispositiu(dp);
        e.afegirDispositiu(dp2);
        e.afegirDispositiu(ds);
        e.afegirDispositiu(dp2);
        
        dp.activar();
        ds.activar();
        
        e.mostrarDispositius();
        
        dp.desactivar();
        dp2.activar();
        ds.desactivar();
        ds2.activar();
        
        e.mostrarDispositius();
        
    }
    
}
