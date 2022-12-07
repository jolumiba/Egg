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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println(" Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5 ) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que haya disfrutado un excelente entretenimiento");
                    break;
                //El equivalente al caso "De otro modo" es el "Default"
                //default:
                //  <acciones>
        }
        } else if (opinion < 0) {
            System.out.println("¿Una opinión negativa? ¿Taaannn mala fue al pelicula? :( ");
        } else if (opinion == 0) {
            System.out.println("El valor " + opinion + "no es válido y no se tomará en cuenta. :(");
        } else {
            System.out.println(opinion + "!Wow! Se te fue la mano en la calificación! :D");
        }
        System.out.println("Hasta la próxima!");
        
    }
    
}
