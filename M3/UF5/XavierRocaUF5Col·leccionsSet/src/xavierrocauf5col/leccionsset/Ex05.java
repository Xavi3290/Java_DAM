/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccionsset;

/**
 *
 * @author usuari
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumne al = new Alumne("xx1","Yassin",8);
        Alumne al2 = new Alumne("xx2","Yassin2",9);
        Alumne al3 = new Alumne("xx3","Yassin3",6);
        Alumne al4 = new Alumne("xx1","Yassin0",10);
        Alumne al5 = new Alumne("xx4","Yassin4",6);
        Alumne al6 = new Alumne("xx5","Yassin5",5);
        
        Curs cu = new Curs("DAM");
        
        cu.afegirAlumne(al);
        cu.afegirAlumne(al3);
        cu.afegirAlumne(al4);
        cu.afegirAlumne(al6);
        cu.afegirAlumne(al5);
        cu.afegirAlumne(al2);
        
        cu.llista();
        
        cu.llistaDNI();
        
        System.out.println("");
        System.out.println(cu.buscar("xx3").toString());
        System.out.println("");
        
        cu.eliminar("xx1");
        
        cu.llistaDNI();
        
        
    }
    
}
