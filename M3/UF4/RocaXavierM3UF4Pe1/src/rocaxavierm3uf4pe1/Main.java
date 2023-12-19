/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocaxavierm3uf4pe1;

/**
 *
 * @author usuari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Galeria ga = new Galeria("NYGalery");

        Quadres qua = new Quadres(30, 20, 1, "XaviQua", "Realista", 50);
        Quadres qua2 = new Quadres(35, 25, 2, "XaviQua2", "Realista2", 60);
        Quadres codRe = new Quadres(20, 20, 1, "XaviRe", "Realista", 40);

        Escultura es = new Escultura("Marbre", 3, "XaviEs", "Realista", 100);
        Escultura es2 = new Escultura("Marbre2", 4, "XaviEs2", "Realista2", 110);
        Escultura es3 = new Escultura("Marbre3", 5, "XaviEs3", "Realista3", 105);

        Mural mur = new Mural(1900, 200, 220, 6, "XaviMur", "Realista", 200);
        Mural mur2 = new Mural(2010, 150, 200, 7, "XaviMur", "Realista", 170);

        ga.afegirObres(es);
        ga.afegirObres(es2);
        ga.afegirObres(es3);
        ga.afegirObres(qua);
        ga.afegirObres(qua2);
        ga.afegirObres(mur);
        ga.afegirObres(mur2);

        ga.afegirObres(codRe);

        ga.mostrarDades();

        ga.eliminarObres(3);

        ga.eliminarObres(100);

        ga.mostrarDades();

        ga.valorTotalVenda();

        ga.mostrarMuralsAvanç2000();
    }

}
