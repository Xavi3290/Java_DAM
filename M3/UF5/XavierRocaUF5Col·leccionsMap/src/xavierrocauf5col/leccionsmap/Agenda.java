/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author usuari
 */
public class Agenda {
    
    private TreeMap<String, Contacte> contactes = new TreeMap<String, Contacte>();
    
   
    
    public void afegir(Contacte co) {
        contactes.put(co.getNom().toLowerCase(), co);
    }
    
    public boolean esborrar(String nom) {        
        Contacte c = contactes.remove(nom.toLowerCase());        
        return c != null;              
    }
    
    public Contacte cercarContacte(String nom) {
        return contactes.get(nom.toLowerCase());
    }
    
    public void showContacte(String nom) {
        System.out.println(cercarContacte(nom).toString());
    }
    
    public void mostrarAgenda(){
        Set<String> ks = contactes.keySet();
        for (String clau : ks) {
            showContacte(clau);
        }
    }
    
    public void mostrarAgendaLletra(char lletra){
        Set<String> ks = contactes.keySet();
        for(String nom : ks){
            if(lletra == nom.charAt(0)){
                showContacte(nom);
            }            
        }
    }
    
    public void  mostrarAgendaPoblacio(String pob){
           Set<String> ks = contactes.keySet();
           for(String key : ks){
            Contacte c= cercarContacte(key);
            if(c.getPoblacio().toLowerCase().startsWith(pob.toLowerCase())){
                showContacte(key);
            }                     
        }
    }
}
