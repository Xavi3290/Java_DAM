/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccionsset;

/**
 *
 * @author usuari
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empresa em = new Empresa("Google");

        Treballador tre = new Treballador("Xavi", "Roca", 2000);
        Treballador tre2 = new Treballador("Xavi2", "Roca", 1800);
        Treballador tre3 = new Treballador("Xavi3", "Roca", 2100);
        Treballador tre4 = new Treballador("Xavi4", "Roca", 1900);
        Treballador tre5 = new Treballador("Xavi5", "Roca", 1700);
        Treballador tre6 = new Treballador("Xavi", "Roca", 2000);

        em.afegirTreballador(tre2);
        em.afegirTreballador(tre4);
        em.afegirTreballador(tre);
        em.afegirTreballador(tre3);
        em.afegirTreballador(tre6);
        em.afegirTreballador(tre5);

//      em.llistaCognomNom();
        em.llista();

        System.out.println("");
        System.out.println(em.buscar("Roca", "Xavi2").toString());
        System.out.println("");

        em.eliminar("Roca", "Xavi4");

        System.out.println("");
        System.out.println(em.modificar("Roca", "Xavi2", "Perez", "Jaime").toString());
        System.out.println("");

//      em.llistaCognomNom();
        em.llista();

    }

}
