/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Informe;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        Informe.imprimir(nombre, apellidoRetornado, ciudad, misNotas, promedio);
        
    }
    
}
/*
Crear un programa donde se calcule el promedio de las notas del usuario, en el
paquete principal se escriben las variables y se escribe el mensaje, en otro paquete
pedir nombre y apellido, el otro paquete pedir su ciudad, en otro paquete pedir
sus 4 notas y en otro paquete hacer el procedimiento para sacar el promedio,
todo eso se devuelve al paquete principal para imprimirlo.
*/