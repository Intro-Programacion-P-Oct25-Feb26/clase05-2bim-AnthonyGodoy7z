/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerNombreEmpresa() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese nombre de la empresa");
        nombre = entrada.nextLine();
        return nombre;
    }
    // método que permita preguntar al usuario la dirección de la empresa

    public static String obtenerDireccionEmpresa() {
        Scanner entrada = new Scanner(System.in);
        String direccion;
        System.out.println("Ingrese dirección de la empresa");
        direccion = entrada.nextLine();
        return direccion;
    }
}
