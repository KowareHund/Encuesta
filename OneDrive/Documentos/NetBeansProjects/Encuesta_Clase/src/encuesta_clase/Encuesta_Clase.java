/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta_clase;
import java.util.Scanner;
/**
 *
 * @author Esteban Ricardo y Juan Osorio
 */
public class Encuesta_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Datos = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = Datos.nextLine();
        
        System.out.println("Ingrese su carrera");
        String carrera = Datos.nextLine();
        
        System.out.println("Ingrese su edad");
        Integer edad = Integer.valueOf(Datos.nextLine());
        
        System.out.println("Ingrese su numero");
        Long numero = Long.valueOf(Datos.nextLine());



       
    }
    
}
