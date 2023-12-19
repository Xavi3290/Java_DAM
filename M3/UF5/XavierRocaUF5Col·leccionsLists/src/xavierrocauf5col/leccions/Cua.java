/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

import java.util.LinkedList;

/**
 *
 * @author usuari
 */
public class Cua<T> {
    
    private LinkedList<T> cuas;

    public Cua() {
        this.cuas = new LinkedList<>();
    }
    
    public boolean empty() {
        return cuas.isEmpty();
    }
    
    public void addLast(T e) {
        cuas.addLast(e);
    }
    
    public void addFirst(T e){
        cuas.addFirst(e);
    }

   public T getFirst() {
        if (!this.empty()) {
            return cuas.removeFirst();
        } else {
            return null;
        }
    }  
    
   public T getLast() {
        if (!this.empty()) {
            return cuas.removeLast();
        } else {
            return null;
        }
    }  
   
   public int quantitat(){
       return cuas.size();
   }
}
