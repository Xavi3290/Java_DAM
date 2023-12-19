/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Treballador tr1 = new Treballador("carlos", "dcar", "tt", 1000);
        Treballador tr2 = new Treballador("anna", "dana", "tt", 1200);

        Empresa emp = new Empresa("nova", "123e");
        emp.afegir(tr1);
        emp.afegir(tr2);

        Treballador tr = emp.getTreballador("dcar");
        if (tr == null) {
            System.out.println("No Existeix");
        } else {
            System.out.println(tr.dades());
        }

        emp.assignarSou("dana", 1300);
        emp.mostra();
        
        Client cl1 = new Client(00000 ,"Pepe", "xxx", "adress");
        Client cl2 = new Client(00001 ,"Pepe1", "xxx1", "adress");
    }
    
}
