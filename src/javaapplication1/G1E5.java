/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Joss
 */
public class G1E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer =  new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        System.out.println("El doble es: " + Math.pow(num, 2));
        System.out.println("El triple es: " + Math.pow(num, 3));
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num));
        
        
        
    }
    
}
