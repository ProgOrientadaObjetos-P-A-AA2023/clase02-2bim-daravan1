/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        
        String nombre = "Rene";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        
         EstudiantePresencial estPresencial= new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
         
         estPresencial.establecerCostoCredito(50.0);
         estPresencial.establecerNumeroCreditos(10);
         estPresencial.calcularMatriculaPresencial();
         
         System.out.printf("%s", estPresencial);
        
    }
}
