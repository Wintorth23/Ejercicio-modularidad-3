/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author jepeh
 */
public class CalculoAcademico {
    public static double calculoPromedio(Double[] notas){
      double suma=0;
      
      for (int i=0 ; i <notas.length; i++){
          
          suma = suma+ notas[i];
          
      }
     
             
      return suma/notas.length;  
    }
    public static boolean aprueba(double promedio){
        
        return promedio >=14;
        
        
        
    }
    public static double puntoExtra(double promedio){
        
        return promedio +1;
    }
}
