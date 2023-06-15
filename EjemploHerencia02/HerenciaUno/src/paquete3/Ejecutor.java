/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "Rene";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre, 
                apellido, identificacion, edad);
        
        System.out.println(estDistancia);
        
         EstudiantePresencial estPresencial = new EstudiantePresencial("Ana", 
                "Burneo", "111015248", 20);
        
        System.out.println(estPresencial);
                
        
    }
}
