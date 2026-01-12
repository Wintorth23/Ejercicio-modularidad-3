/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad;
import java.util.*;

/**
 *
 * @author jepeh
 */
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre del Estudiante");
        String nombre =sc.nextLine();
        System.out.println("Ingrese la cantidad de notas a registrar");
        int n = sc.nextInt();
        Double[] notas=new Double[n];
        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese las nota "+(i+1));
            notas[i]=sc.nextDouble();
            
            
        }
        Estudiante e =new Estudiante(nombre,notas);
        double promedio =CalculoAcademico.calculoPromedio(e.notas);
        boolean aprovado=CalculoAcademico.aprueba(promedio);
        double extra=CalculoAcademico.puntoExtra(promedio);
        System.out.println("Desea aplicar el punto extra ");
        System.out.println("S.1"+"\nN.2");
        int op = sc.nextInt();
        if (op==1) {
            CalculoAcademico.puntoExtra(promedio);
            CReporte.mostrarResultado(e, aprovado, promedio);
            
        }
        else
        {
            CReporte.mostrarResultado(e, aprovado, promedio);
        }
       sc.close();
    }
    
}
