/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlescolar;
import java.util.Scanner;

/**
 *
 * @author Juan Emba
 */
public class Calificaciones {
    
     Scanner mat = new Scanner(System.in);
    double calificacion1,calificacion2,calificacion3,calificacion4,promedio;
    
    public void Materias (){
        
        System.out.println("Promedios de Calificaciones: ");
         System.out.println("Calculo");
         System.out.println("ingresa la calificacion ");
         calificacion1=mat.nextDouble();
        System.out.println("Circuitos");
        System.out.println("ingresa la calificacion");
         calificacion2 = mat.nextDouble();
         System.out.println("Ingles");
        System.out.println("ingresa la calificacion");
         calificacion3 = mat.nextDouble();
         System.out.println("Programacion");
        System.out.println("ingresa la calificacion");
         calificacion4 = mat.nextDouble();
    }
    
    public void Promedio (){
        promedio=(calificacion1+calificacion2+calificacion3+calificacion4)/4;
        System.out.println("el promedio de las calificaciones es: "+ promedio);
    }
    
     public static void main(String[] args) {
         Calificaciones califi = new Calificaciones();
         califi.Materias();
         califi.Promedio();
     }
}
