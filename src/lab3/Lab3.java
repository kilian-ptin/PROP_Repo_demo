/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

/**
 *
 * @author kilian
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, String> ferreteria = new HashMap<>();
        ferreteria.put("RT45", "Cargol 3");
        ferreteria.put("RT4j", "Cargol 7");
        ferreteria.put("JK23", "Cable RJ45");
        
        System.out.println("> " + ferreteria.get("JK23"));
        System.out.println("> " + ferreteria.get("XXXXXX"));
        System.out.println("> " + ferreteria.containsKey("JK23"));
        System.out.println("> " + ferreteria.containsKey("XXXXXX"));
        
        for(String clau: ferreteria.keySet()) {
            System.out.println("> " + clau + ": " + ferreteria.get(clau));
        }
        
        /////////////////////////////////////////////////////////////////////
        
        String[] frase=("una", "bonica", "frase", "una", "frase", "hola");
        
        Map<String, Integer> freq = new HashMap<>();
        
        for(int i = 0;i< frase.length; i++) {
            int f = 0;
            if(freq.containsKey(frase[i])) {
                f = freq.get(frase[i]);     
            }
            f++;
            freq.put(frase[i],f);
           
        }
            
    }
    
}
