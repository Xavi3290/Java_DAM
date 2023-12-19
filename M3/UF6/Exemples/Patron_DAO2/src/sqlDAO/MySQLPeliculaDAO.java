/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDAO;

import dao.PeliculaDAO;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pelicula;
import java.sql.*;


/**
 *
 * @author agustincintas
 */
public class MySQLPeliculaDAO extends Conexion implements PeliculaDAO {

    @Override
    public boolean insertar(Pelicula a) {
        
       final String INSERT = "INSERT INTO Peliculas(ID,Titulo,FechaEstreno,Duracion) VALUES (?,?,?,?)";
        PreparedStatement st = null;
      try{
            this.conectar();
          st=conex.prepareStatement(INSERT);
          st.setInt(1, a.getId());
          st.setString(2, a.getTitulo());
          st.setDate(3,a.getFechaEstreno());
          st.setInt(4, a.getDuracion());
          
          
          if(ifExists("SELECT * FROM Peliculas where ID = ?",a.getId())){
             return false;
          
      }else{
               int cont= st.executeUpdate();
              System.out.println("Pelicula insertada amb exit "+cont);
          }
      
       
          
          
      }catch(Exception e){
          System.out.println(e.getMessage());
          
          
      }finally{
          if(st!=null){
              try{
                  this.desconectar();
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }
          }
      }
        return true;
        
        
       
    }

    @Override
    public void modificar(Pelicula a) {
        
        final String UPDATE = "UPDATE Peliculas SET Titulo = ?,FechaEstreno = ?,Duracion = ? where ID = ?";
        
          PreparedStatement st = null;
      try{
            this.conectar();
          st=conex.prepareStatement(UPDATE);
          st.setString(1, a.getTitulo());
          st.setDate(2,new Date(a.getFechaEstreno().getTime()));
          st.setInt(3, a.getDuracion());
          st.setInt(4, a.getId());
          
          
          int count = st.executeUpdate();
          
          System.out.println("Modificació executada: "+count);
        
          
      }catch(Exception e){
          System.out.println(e.getMessage());
          
          
      }finally{
          if(st!=null){
              try{
                  this.desconectar();
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }
          }
      }
        
        
        
        
    }

    @Override
    public void eliminar(Pelicula a) {
        final String DELETE = "DELETE FROM Peliculas where ID= ?";
        final String DELETETAULA = "DELETE FROM Peliculas_directores where pelicula_id = ?";
     
        
          PreparedStatement st = null;
          PreparedStatement stm = null;
      try{
            this.conectar();
          st=conex.prepareStatement(DELETE);
          stm=conex.prepareStatement(DELETETAULA);
          st.setInt(1, a.getId());
          stm.setInt(1, a.getId());
          
          int count = st.executeUpdate();
          int cont = stm.executeUpdate();
          System.out.println("Eliminació executada: "+count+cont);
          
          
          
      }catch(Exception e){
          System.out.println(e.getMessage());
          
          
      }finally{
          if(st!=null && stm!=null){
              try{
                  this.desconectar();
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }
          }
      }
    }

    private Pelicula convertir(ResultSet rs) throws SQLException{
        int id = rs.getInt("ID");
        String nombre = rs.getString("Titulo");
        Date fecha = rs.getDate("FechaEstreno");
        int durasao = rs.getInt("Duracion");
        
        Pelicula peli = new Pelicula(id,nombre,fecha,durasao);
        return peli;
        
        
        
    }
    
    @Override
    public List<Pelicula> obtenerTodos() {
    final String getAll="SELECT ID,Titulo,FechaEstreno,Duracion from Peliculas";
    
    PreparedStatement stat = null;
        ResultSet rs = null;
        Pelicula a = null;
        List<Pelicula> pelis = new ArrayList<>();
        try{
            this.conectar();
            stat=conex.prepareStatement(getAll);
            
            rs=stat.executeQuery();
            while(rs.next()){
                pelis.add(convertir(rs));
            }
            
            
        }catch(Exception e){
            
        }finally{
            try {
                this.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        return pelis;
    }

    @Override
    public Pelicula obtener(Integer id) {
        final String getOne="SELECT ID,Titulo,FechaEstreno,Duracion from Peliculas where ID = ?";
        
        PreparedStatement stat = null;
        ResultSet rs = null;
        Pelicula a = null;
        
        try{
            this.conectar();
            stat=conex.prepareStatement(getOne);
            stat.setInt(1, id);
            rs=stat.executeQuery();
            
            if(rs.next()){
                a=convertir(rs);
                
            }
            
        }catch(Exception e){
            
        }finally{
            try {
                this.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        return a;
        
    }
    
    public void ordenarPelisId(){
        
        
        
         List<Pelicula> p =obtenerTodos();
        
        Set<Pelicula> sp = new TreeSet<>();
        sp.addAll(p);
        for (Pelicula a:sp) {
            System.out.println(a.toString());
            
        }
        
    }
    
    public static boolean ifExists(String sSQL, int nId) throws SQLException {
        PreparedStatement ps = conex.prepareStatement(sSQL);
        ps.setInt(1, nId);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
}
