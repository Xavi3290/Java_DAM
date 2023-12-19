/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5col.leccions;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Document doc = new Document("Hola","Que tal?");
        Document doc2 = new Document("Hola2","Que tal?2");
        Document doc3 = new Document("Hola3","Que tal?3");
        Document doc4 = new Document("Hola4","Que tal?4");
        Document doc5 = new Document("Hola5","Que tal?5");
        
        Impresora imp = new Impresora();
        
        imp.afegirDocument(doc);
        imp.afegirDocument(doc2);
        imp.afegirDocument(doc3);
        imp.afegirDocument(doc4);
        imp.afegirDocument(doc5);
        
         while (!imp.cuaBuida()) {
           imp.imprimirDocument();
        }
        
    }
    
}
