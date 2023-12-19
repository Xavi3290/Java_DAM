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
public class Pila<T> {

    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    public void push(T e) {
        elementos.addLast(e);
    }

    public T pop() {
        if (!this.empty()) {
            return elementos.removeLast();
        } else {
            return null;
        }
    }  
       
}
