/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo002 {
    
    public static void main(String[] args) {
        int [] valores = {10, 1, 3, 4, 9};
        boolean v = ArrayUtils.contains(valores, 12);
        
        System.out.printf("%s\n", v);
    }
}
