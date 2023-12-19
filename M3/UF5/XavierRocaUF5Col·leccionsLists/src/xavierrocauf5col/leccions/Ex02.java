/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccions;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cua<Integer> c = new Cua<>();
        Integer i = new Integer(9);
        c.getFirst();
        c.addLast(4);
        c.addLast(6);
        c.addLast(10);
        c.getFirst();
        
        Cua<Persona> per = new Cua<>();
        
        Professor pro = new Professor("0001", "Xavi", "xxxx1");
        Professor pro2 = new Professor("0002", "Xavi2", "xxxx2");
        Alumne alu = new Alumne("Xavi", "xxxx3");
        Alumne alu2 = new Alumne("Xavi2", "xxxx4");
        Alumne alu3 = new Alumne("Xavi3", "xxxx5");
        
        per.addLast(pro);
        per.addLast(pro2);
        per.addLast(alu);
        per.addLast(alu2);
        per.addLast(alu3);       
                
        while (!per.empty()) {
            System.out.println(per.getFirst().toString());
        }
        
       
    }
    
}
