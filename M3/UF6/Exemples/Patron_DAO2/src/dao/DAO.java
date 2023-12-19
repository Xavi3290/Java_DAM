/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author agustincintas
 */
public interface DAO<T,K> {
    
    boolean insertar(T a);
    void modificar(T a);
    void eliminar(T a);
    List<T> obtenerTodos();
    T obtener(K id);
    
}
