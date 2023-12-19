/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Institut in = new Institut("Vallbona");
        Eso e = new Eso("Xavi", "xxxxx");
        Eso e2 = new Eso("Xavi1", "xxxxx");
        Eso e3 = new Eso("Xavi2", "xxxxx");
        Batxillerat b = new Batxillerat("Xavi3", "xxxx");
        Batxillerat b2 = new Batxillerat("Xavi4", "xxxx");
        Batxillerat b3 = new Batxillerat("Xavi5", "xxxx");
        double nota[] = {8,9,10};
        double nota2[] = {7,9,8};
        double nota3[] = {5,5,4};
        double nota4[] = {3,4,4};
        double nota5[] = {6,5,8};
        double nota6[] = {5,5,5};
        
        
        in.afegirAlumne(e);
        in.afegirAlumne(e2);
        in.afegirAlumne(e3);
        in.afegirAlumne(b);
        in.afegirAlumne(b2);
        in.afegirAlumne(b3);
        e.setNotes(nota);
        e2.setNotes(nota2);
        e3.setNotes(nota3);
        b.setNotes(nota4);
        b2.setNotes(nota5);
        b3.setNotes(nota6);
        
        System.out.println(in.toString());
        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(b.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());   
        
        if (e.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
         if (e2.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
          if (e3.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
           if (b.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
            if (b2.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
             if (b3.pasaCurs() == true){
            System.out.println("Pasa curs");
        }else{
            System.out.println("No pasa curs");
        }
            
        
        
        
    }
    
}
