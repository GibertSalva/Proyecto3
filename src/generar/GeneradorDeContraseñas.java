/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generar;

import generador.password;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GeneradorDeContraseñas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long largo;
        String contra;
        Scanner ind = new Scanner(System.in);
        password Sistema = new password();
        System.out.println("1:INGRESAR CONTRA o 2:COMPROBAR");
        
        
        switch(ind.nextInt()){
            case 1:
                System.out.println("LONGITUD: ");
                largo = ind.nextLong();
                contra = (Sistema.generarPassword(largo));
                System.out.println(contra);
                System.out.println(Sistema.esFuerte(contra));
                break;
            case 2:
                System.out.println("CONTRA: ");
                contra = ind.next();
                System.out.println(Sistema.esFuerte(contra));
                break;
        }
    }
    
}
