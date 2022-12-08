/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Joss
 */
public class G1E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        if (num % 2 == 0)  {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    
    }
    
}
