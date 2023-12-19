/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

/**
 *
 * @author usuari
 */
public class Impresora {
    
    private Cua<Document> cuaDeDocuments = new Cua<>();   
    
    public void afegirDocument(Document doc){
        cuaDeDocuments.addLast(doc);
    }
    
    public void imprimirDocument(){        
        System.out.println(cuaDeDocuments.getFirst().toString());
    }
    
    public boolean cuaBuida(){
        return cuaDeDocuments.empty();
    }
    
}
