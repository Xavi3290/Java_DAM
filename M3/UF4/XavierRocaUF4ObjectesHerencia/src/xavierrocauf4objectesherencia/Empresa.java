/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Empresa {
    /**
     * nom de l'empresa
     */
    private String nom;
    /**
     * NIF de l'empresa
     */
    private String nif;
    /**
     * llista de treballadors de l'empresa
     */
    private ArrayList<Treballador> treballadors;
    private ArrayList<Client> clients;

    public Empresa(String nom, String nif) {
        this.nom = nom;
        this.nif = nif;
        this.treballadors = new ArrayList<Treballador>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNIF() {
        return nif;
    }

    public void setNIF(String NIF) {
        this.nif = NIF;
    }

    /**
     * Retorna la posició del treballador a l'ArrayList donat el seu dni.
     * @param dni del treballador a cercar
     * @return la posició o -1 si no hi és.
     */
    private int cercar(String dni) {
        int posicio = -1;
        boolean trobat = false;
        int i = 0;

        while ((trobat == false) && (i < treballadors.size())) {
            if (treballadors.get(i).getDni().equals(dni)) {
                trobat = true;
                posicio = i;
            }
            i++;
        }
        //System.out.println("Posicio " + posicio);
        return posicio;

    }

    /**
     * Retorna el treballador de l'empresa per cercant dni
     * @param dni del treballador
     * @return el treballador o null si no el troba.
     */
    public Treballador getTreballador(String dni) {
        Treballador tr = null;
        int pos = this.cercar(dni);
        if (pos != -1) {
            tr = this.treballadors.get(pos);
        }
        return tr;

    }

    /**
     * Afegir un treballador al llistat passant un objecte treballador
     * @param tr treballador a afegir.
     */
    public void afegir(Treballador tr) {

        this.treballadors.add(tr);
    }

    /**
     * Eliminar un treballador al llistat passant un objecte treballador
     *
     * @param tr treballador a eliminar que previament ha sigut cercat
     */
    public void eliminar(Treballador tr) {
        this.treballadors.remove(tr);
    }

    /**
     * eliminar un trebalaldor al llistat passant el seu dni
     *
     * @param dni del treballador a eliminar.
     */
    public void eliminar(String dni) {
        int pos = this.cercar(dni);
        if (pos != -1) {
            this.treballadors.remove(pos);
        }
    }

    /**
     * mètode que retorna el número de treballadors de l'empresa
     *
     * @return num de treballadors
     */
    public int numTreb() {
        return treballadors.size();
    }

    /**
     * mètode que assigna un sou a un treballador
     *
     * @param dni del treballador a assignar el sou
     * @param sou a assignar al treballador
     */
    public void assignarSou(String dni, float sou) {
        int pos = this.cercar(dni);
        if (pos != -1) {
            Treballador tr = treballadors.get(pos);
            tr.setSou(sou);
        }
    }

    /**
     * Despese mensuals de l'empresa en sous
     *
     * @return total de despeses en nòmines mensuals
     */
    public float despesesEnNomines() {
        float despeses = 0;

        for (Treballador tr : treballadors) {
            despeses = despeses + tr.getSou();
        }
        return despeses;
    }

    /**
     * Llista per consola tots els treballadors de l'empresa
     */
    public void mostra() {
        System.out.println("Empresa:" + this.getNom());
        System.out.println("Lista treballadors:");
        for (Treballador tr : treballadors) {
            System.out.println(tr.dades());
        }
        System.out.println("------------");

    }
    
    public void afegirClient(Client cl){
        this.clients.add(cl);
    }
    
    public void eliminarClient(Client cl){
        this.clients.remove(cl);
    }
    
    public int numClients(){
        return clients.size();
    }
}
