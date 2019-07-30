/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

/**
 *
 * 
 */
public class password {
    String contrase = "";
    
    public String esFuerte(String password){
        if (password.length() > 8){
            return "ES FUERTE";
        }
        
        else{
            return "ES DEBIL";
        }
    }
    
    public String generarPassword(long largo){
        for (int i = 0; i < largo; i+=1){
            contrase += Long.toString(Math.round(Math.random()* largo));
        }
        return contrase;
    }
}
