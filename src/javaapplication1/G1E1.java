/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Joss
 */
public class G1E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese segundo número: ");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma es: "+suma);
        
        
    }
    
}
