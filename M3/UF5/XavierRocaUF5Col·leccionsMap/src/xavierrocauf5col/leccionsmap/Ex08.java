/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

/**
 *
 * @author usuari
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Agenda ag = new Agenda();
        
        Contacte co = new Contacte("Xavi","Carrer Maragall","Granollers",123456);
        Contacte co2 = new Contacte("Xavi2","Carrer Maragall2","Granollers2",123456);
        Contacte co3 = new Contacte("Xavi3","Carrer Maragall3","Granollers3",123456);
        Contacte co4 = new Contacte("Xavi4","Carrer Maragall4","Granollers4",123456);
        Contacte co5 = new Contacte("Pere","Carrer Maragall5","Mollet",123456);
        Contacte co6 = new Contacte("Pere2","Carrer Maragall6","Mollet",123456);
        
        ag.afegir(co);
        ag.afegir(co2);
        ag.afegir(co3);
        ag.afegir(co4);
        ag.afegir(co5);
        ag.afegir(co6);
        
        ag.mostrarAgenda();
        System.out.println("");
        ag.mostrarAgendaLletra('p');
        System.out.println("");
        ag.mostrarAgendaPoblacio("moll");
        
        
        
        
    }
    
}
