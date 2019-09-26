/*
 *Este consiste en crear dos variables fuera que consiste en dos integrales 
 *primero y segundo que seran las variables que guardara los datos del scanner
 *luego creamos otro metodo en void donde los trabajara y en los argumentos
 *creamos dos nuevas que seran los que nos pedira al hacerlo
 */
package Operaciones;

import java.util.Scanner;

/**
 * @version 1.0
 * @method main
 * @author Kike
 */
public class resEjer {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @method main
     * @param args
     */
    static int primero;
    static int segundo;

    public static void main(String[] args) {

        // Cuerpo del metodo
        System.out.println("Introduzca el primer numero");
        primero = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        segundo = teclado.nextInt();
        sumarNumeros(primero,segundo);
        restarNumeros(primero,segundo);
        multNumeros(primero,segundo);
        divNumeros(primero,segundo);
    }

    public static void sumarNumeros(int num1, int num2) {
        
       int suma;
       suma = num1 + num2;
       System.out.println("La suma es "+suma);
       
    }
    
    public static void restarNumeros(int num1, int num2){
        
        int resta;
        resta = num1 - num2;
        System.out.println("La resta es " +resta);
        
    }
    
    public static void multNumeros(int num1, int num2){
        
        int mult;
        mult = num1 * num2;
        System.out.println("La multiplicación es " +mult);
    }
    
    public static void divNumeros(int num1, int num2){
        
        int div;
        div = num1 * num2;
        System.out.println("La división es " +div);
    }
}
