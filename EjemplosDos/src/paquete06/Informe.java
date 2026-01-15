/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class Informe {
    public static void imprimir(String a, String b, String c, double [] notas, 
            double promedio){
        String mensaje = "";
        for (int i = 0; i < notas.length; i++){
            mensaje = String.format("%s%.2f\t",mensaje, notas[i]);
                
        }
        mensaje = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n",
                a,
                b,
                c,
                mensaje,
                promedio);
        System.out.printf(mensaje);
    }
    
}
