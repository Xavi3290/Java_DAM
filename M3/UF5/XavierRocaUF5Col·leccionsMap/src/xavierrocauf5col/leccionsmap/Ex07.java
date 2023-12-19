/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

/**
 *
 * @author usuari
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Diccionari dic = new Diccionari();
        
        Paraula pa =  new Paraula("Hola","Salutacio","Español","interjección");
        Paraula pa2 =  new Paraula("Hola2","Salutacio2","Español2","interjección2");
        Paraula pa3 =  new Paraula("Hola3","Salutacio3","Español3","interjección3");
        Paraula pa4 =  new Paraula("Hola4","Salutacio4","Español4","interjección4");
        Paraula pa5 =  new Paraula("Hola5","Salutacio5","Español5","interjección5");
        
        dic.afegir(pa);
        dic.afegir(pa3);
        dic.afegir(pa5);
        dic.afegir(pa);
        dic.afegir(pa4);
        dic.afegir(pa2);
        
        System.out.println("");
        dic.showParaula("Hola3");
        System.out.println("");
        
        dic.mostrarDiccionari();
        System.out.println("");
        System.out.println(dic.esborrar("Hola4"));
        System.out.println(dic.esborrar("paraula"));
        System.out.println("");
        dic.mostrarDiccionari();
        
    }
    
}
