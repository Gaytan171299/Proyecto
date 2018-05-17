/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kakaw;

/**
 *
 * @author josec
 */
public class Tarjeta {
     private String Tarjeta;
     private String Compañia;
     private String Banco;
     private String Tipo;
     public String correoe;
      
     public Tarjeta(){}
     public Tarjeta(String tarjeta,String compañia, String banco,String tipo){
this.Tarjeta=tarjeta;
this.Compañia=compañia;
this.Banco=banco;
this.Tipo=tipo;

} 

     public String getTarjeta(){
     return Tarjeta;
     }
     public String getCompañia(){
     return Compañia;
     }
     public String getBanco(){
     return Banco;
     }
     public String getTipo(){
     return Tipo;
     }
     public void setTarjeta (String tarjeta){
         this.Tarjeta=tarjeta;
     }
     public void setCompañia(String compañia){
     this.Compañia=compañia;
     }
     public void setBanco(String banco){
     this.Banco=banco;
     }
     public void setTipo(String tipo){
     this.Tipo=tipo;
     }
     
     }


     
     

  