/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Joss
 */
public class G1E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c, f;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los grados centìgrados: ");
        c = leer.nextDouble();
        f = 32 + (9 * c / 5);
        System.out.println("Convertido a Fahrenheit es: " + f);
        
    }
    
}
