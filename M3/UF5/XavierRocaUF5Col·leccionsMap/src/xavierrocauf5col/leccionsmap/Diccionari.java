/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author usuari
 */
public class Diccionari {

    private TreeMap<String, Paraula> llista = new TreeMap<String, Paraula>();

    
    public void afegir(Paraula pa) {
        llista.put(pa.getNom().toLowerCase(), pa);
    }

    public boolean esborrar(String nom) {        
        Paraula p = llista.remove(nom.toLowerCase());        
        return p != null;              
    }

    public Paraula cercarParaula(String nom) {
        return llista.get(nom.toLowerCase());
    }

    public void showParaula(String nom) {
        System.out.println(cercarParaula(nom).toString());
    }

    public void mostrarDiccionari() {
//        System.out.println("Amb iterador");
//        Iterator<String> it;
        Set<String> ks = llista.keySet();
//        it = ks.iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            System.out.println(showParaula(key));
//        }
//        System.out.println("Amb Enahanced For");
        for (String key : ks) {
            showParaula(key);
        }
    }
}
