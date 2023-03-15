/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlescolar;
import java.util.Scanner;  
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Emba
 */
public class ControlEscolar {
    Scanner tem = new Scanner(System.in);
    
    public void InfomracionPersonal (){
        
        
         String nombre_completo;
         System.out.println("ingresa el nombre completo");
         nombre_completo = tem.nextLine();
        String fecha_nacimiento;
        System.out.println("ingresa la fecha de nacimiento");
         fecha_nacimiento = tem.nextLine();
        String telefono;
        System.out.println("ingresa el telefono");
         telefono = tem.nextLine();
        String direccion;
        System.out.println("ingresa tu direccion");
         direccion = tem.nextLine();
        
    }
    
    public void InformacionAcademica (){
        String numero_cuenta;
        
        System.out.print("Ingresa el numero de cuenta");
        
        numero_cuenta = tem.nextLine();
        String semestre;
        
        System.out.print("Ingresa el semestre que estas cursando");
        
        semestre = tem.nextLine();
        
    }
    
    
    public void Horarios (){
        String materias = "  Calculo,      Programacion,       circuitos ";
        String horarios = " 7:00 a 9:00,  10:00 a 12:30,    12:30 a 14:30";
         System.out.println("Las materia son: " + materias);
        System.out.println("Los horarios son: " + horarios);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        ControlEscolar datos_personales = new ControlEscolar();
        datos_personales.InfomracionPersonal();
        datos_personales.Horarios();
        datos_personales.InformacionAcademica();
         Calificaciones llamada2 = new Calificaciones();
       llamada2.Materias();
         llamada2.Promedio();
        
    }
    
}
