/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author jepeh
 */
public class CReporte {
 public static void mostrarResultado(Estudiante e, boolean aprovado, double promedio){
     System.out.println("Estudiante: "+ e.nombre);
     System.out.println("Estado: "+ promedio);
     System.out.println("Estado: "+(aprovado ? "Aprobado":"Reprovado" ));
     
 }   
}
