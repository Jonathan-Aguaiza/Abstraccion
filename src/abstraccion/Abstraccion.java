/*
Ingresar por teclado un objeto y la clase sel objeto
 */
package abstraccion;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese un objeto del mundo real:");
        String r1=objeto.nextLine();
        /*
        motor
        */
        System.out.println("Ingrese clase 1:");
        String cl1=objeto.nextLine();
        /*
        electrico
        */
        System.out.println("Ingrese clase 2:");
        String cl2=objeto.nextLine();
        /*
        combustion interna
        */
        System.out.println("Ingrese clase 3:");
        String cl3=objeto.nextLine();
        /*
        dos tiempos
        */
        System.out.println("Ingrese clase 4:");
        String cl4=objeto.nextLine();
        /*
        cuatro tiempos
        */
        
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
         System.out.println("");
        System.out.println("Objeto");
        System.out.println(""+r1);
        System.out.println("");
        System.out.println("Clase de objeto");
        System.out.println("1.-"+cl1);
        System.out.println("2.-"+cl2);
        System.out.println("3.-"+cl3);
        System.out.println("4.-"+cl4);
        System.out.println("");
    }
}
