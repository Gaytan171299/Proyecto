/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kakaw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author josec
 */



public class Conexion {
    private Connection conexion;
    private Statement sentencia;
    private static Conexion instancia;
    public static Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;        
    }
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/kawkawdb?user=root&password=0898jose");
            sentencia= conexion.createStatement();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
   } 
    public ResultSet hacerConsulta (String consulta){
        ResultSet resultado=null;
        try{
            resultado=sentencia.executeQuery(consulta);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return resultado;
    }
    public void ejecutarSentencia(String consulta){
        try{
            sentencia.execute(consulta);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConexion(){
        return conexion;
    }
    public Statement getSentencia(){
        return sentencia;
    }
}
