/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta_clase;
import java.util.Scanner;   //Se importa el Scanner para usarlo
/**
 *
 * @author Esteban Ricardo y Juan Osorio
 */
public class Encuesta_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Datos = new Scanner(System.in);    //Se inicia el Scanner con el nombre Datos
        
        System.out.println("Ingrese su nombre");    //Se piden y guardan los diferentes tipos de datos
        String nombre = Datos.nextLine();
        
        System.out.println("Ingrese su carrera");
        String carrera = Datos.nextLine();
        
        System.out.println("Ingrese su edad");
        Integer edad = Integer.valueOf(Datos.nextLine());    
        
        System.out.println("Ingrese su numero");
        Long numero = Long.valueOf(Datos.nextLine());    //Se coloca long puesto que el telefono supera buffer del int 

        System.out.println("--------------------------------------------------");
        System.out.println("|             Datos antes del cambio             |");   
        System.out.println("|     Su nombre es: "+ nombre );           //Se muestran los resultados obtenidos
        System.out.println("|     Su carrera es: "+ carrera );
        System.out.println("|     Su edad es: "+ edad );
        System.out.println("|     Su telefono es: "+ numero );
        System.out.println("--------------------------------------------------");

        
    }
    
}
