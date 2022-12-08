/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author Joss
 */
public class G1E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, min, may;
        Scanner leer =  new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        //frase = leer.next
        min = frase.toLowerCase();
        may = frase.toUpperCase();
        
        //System.out.println(frase);
        System.out.println(min);
        System.out.println(may);
    }
    
}
