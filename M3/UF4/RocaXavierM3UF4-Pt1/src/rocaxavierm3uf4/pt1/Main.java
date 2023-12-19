/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocaxavierm3uf4.pt1;

import static rocaxavierm3uf4.pt1.Util.llegirInt;
import static rocaxavierm3uf4.pt1.Util.llegirString;

/**
 *
 * @author usuari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu;

        Universitat uni = carregarDades();

        do {
            menu = llegirInt("\nMenu\n\n1-Llistar tots els membres\n2-Llistar tots els alumnes\n3-Llistar alumnes doctorats\n4-Llistar tots els professors\n5-Llistar per DNI\n6-Eliminar per DNI\n7-Llistar assignatures\n8-Sortir");
            switch (menu) {
                case 1:
                    uni.mostrarPersones();
                    break;
                case 2:
                    uni.mostrarAlumnes();
                    break;
                case 3:
                    uni.mostrarDoctorats();
                    break;
                case 4:
                    uni.mostrarProfessors();
                    break;
                case 5:
                    uni.mostrarPersonesDNI();
                    break;
                case 6:
                    uni.eliminarPersona();
                    break;
                case 7:
                    uni.mostrarAssignaturaAlumneYProfessors();
                    break;
                case 8:                    
                    System.out.println("\n\nAdeu");
                    break;
                default:
                    System.out.println("\nError\n");
                    break;
            }
        } while (menu != 8);

    }

    /**
     * Crea la universitat,amb les assignatures, professors, becats, doctorats,
     * alumnes afegits.
     *
     * @return retorna la universitat
     */
    public static Universitat carregarDades() {

        Universitat uni = new Universitat("UPC");

        Alumne alu = new Alumne("xxxxxxxx1", "Xavi", "Roca");
        Alumne alu2 = new Alumne("xxxxxxxx2", "Xavi2", "Roca2");
        Alumne alu3 = new Alumne("xxxxxxxx3", "Xavi3", "Roca3");
        Alumne alu4 = new Alumne("xxxxxxxx4", "Xavi4", "Roca4");
        Alumne alu5 = new Alumne("xxxxxxxx5", "Xavi5", "Roca5");

        Assignatura ass = new Assignatura("M1");
        Assignatura ass2 = new Assignatura("M2");
        Assignatura ass3 = new Assignatura("M3");
        Assignatura ass4 = new Assignatura("M4");
        Assignatura ass5 = new Assignatura("M5");

        Professor pro = new Professor("1/1/2000", "xxxxxxx1x", "Paco", "Perez");
        Professor pro2 = new Professor("2/1/2000", "xxxxxxx2x", "Paco2", "Perez2");
        Professor pro3 = new Professor("3/1/2000", "xxxxxxx3x", "Paco3", "Perez3");
        Professor pro4 = new Professor("4/1/2000", "xxxxxxx4x", "Paco4", "Perez4");
        Professor pro5 = new Professor("5/1/2000", "xxxxxxx5x", "Paco5", "Perez5");

        Becat be = new Becat("beca", "xxxxxx1xx", "XaviB", "RocaB");
        Becat be2 = new Becat("beca2", "xxxxxx2xx", "XaviB2", "RocaB2");
        Becat be3 = new Becat("beca3", "xxxxxx3xx", "XaviB3", "RocaB3");
        Becat be4 = new Becat("beca4", "xxxxxx4xx", "XaviB4", "RocaB4");
        Becat be5 = new Becat("beca5", "xxxxxx5xx", "XaviB5", "RocaB5");

        Doctorat doc = new Doctorat("1/2/2000", "eventual", "xxxxx1xxx", "XaviD", "RocaD", pro);
        Doctorat doc2 = new Doctorat("2/2/2000", "eventual2", "xxxxx2xxx", "XaviD2", "RocaD2", pro2);
        Doctorat doc3 = new Doctorat("3/2/2000", "eventual3", "xxxxx3xxx", "XaviD3", "RocaD3", pro3);
        Doctorat doc4 = new Doctorat("4/2/2000", "eventual4", "xxxxx4xxx", "XaviD4", "RocaD4", pro4);
        Doctorat doc5 = new Doctorat("5/2/2000", "eventual5", "xxxxx5xxx", "XaviD5", "RocaD5", pro5);

        alu.afegirAssignatura(ass);
        alu2.afegirAssignatura(ass2);
        alu2.afegirAssignatura(ass3);
        alu3.afegirAssignatura(ass4);
        alu4.afegirAssignatura(ass5);
        alu4.afegirAssignatura(ass);
        alu5.afegirAssignatura(ass2);
        alu5.afegirAssignatura(ass5);
        alu5.afegirAssignatura(ass4);

        pro.afegirAssignatura(ass);
        pro2.afegirAssignatura(ass2);
        pro3.afegirAssignatura(ass3);
        pro4.afegirAssignatura(ass4);
        pro5.afegirAssignatura(ass5);

        be.afegirAssignatura(ass);
        be2.afegirAssignatura(ass2);
        be2.afegirAssignatura(ass3);
        be3.afegirAssignatura(ass4);
        be4.afegirAssignatura(ass5);
        be4.afegirAssignatura(ass);
        be5.afegirAssignatura(ass2);
        be5.afegirAssignatura(ass5);
        be5.afegirAssignatura(ass4);

        doc.afegirAssignatura(ass);
        doc2.afegirAssignatura(ass2);
        doc2.afegirAssignatura(ass3);
        doc3.afegirAssignatura(ass4);
        doc4.afegirAssignatura(ass5);
        doc4.afegirAssignatura(ass);
        doc5.afegirAssignatura(ass2);
        doc5.afegirAssignatura(ass5);
        doc5.afegirAssignatura(ass4);

        uni.afegirPersona(alu);
        uni.afegirPersona(alu2);
        uni.afegirPersona(alu3);
        uni.afegirPersona(alu4);
        uni.afegirPersona(alu5);
        uni.afegirPersona(pro);
        uni.afegirPersona(pro2);
        uni.afegirPersona(pro3);
        uni.afegirPersona(pro4);
        uni.afegirPersona(pro5);
        uni.afegirPersona(be);
        uni.afegirPersona(be2);
        uni.afegirPersona(be3);
        uni.afegirPersona(be4);
        uni.afegirPersona(be5);
        uni.afegirPersona(doc);
        uni.afegirPersona(doc2);
        uni.afegirPersona(doc3);
        uni.afegirPersona(doc4);
        uni.afegirPersona(doc5);

        uni.afegirAssignatura(ass);
        uni.afegirAssignatura(ass2);
        uni.afegirAssignatura(ass3);
        uni.afegirAssignatura(ass4);
        uni.afegirAssignatura(ass5);

        return uni;
    }

}
