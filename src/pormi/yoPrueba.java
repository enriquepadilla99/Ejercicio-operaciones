/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Comentado
 */
package pormi;

import java.util.Scanner;

/**
 *
 * @author Kike
 */
public class yoPrueba {
    
    static Scanner teclado = new Scanner(System.in);

    /**
     * @method main
     * @param args
     */
    static double primero;
    static double segundo;

    public static void main(String[] args) {

        // Cuerpo del metodo
        System.out.println("Introduzca el primer numero");
        primero = teclado.nextDouble();
        System.out.println("Introduzca el segundo numero");
        segundo = teclado.nextDouble();
        System.out.println("La suma es " +sumarNumeros(primero,segundo));
        System.out.println("La resta es " +restarNumeros(primero,segundo));
        System.out.println("La multiplicación es " +multNumeros(primero,segundo));
        System.out.println("La división es " +divNumeros(primero,segundo));
        
    }

    public static double sumarNumeros(double num1, double num2) {
        
       double suma;
       suma = num1 + num2;
       
       return suma;
       
       
    }
    
    public static double restarNumeros(double num1, double num2){
        
        double resta;
        resta = num1 - num2;
        return resta;
        
    }
    
    public static double multNumeros(double num1, double num2){
        
        double mult;
        mult = num1 * num2;
        return mult;
    }
    
    public static double divNumeros(double num1, double num2){
       double divi;
       
        try{
            divi = num1 / num2;
        }catch (Exception e){
            System.out.println("No se puede dividir entre cero");
            divi = 0;
            
        }
       
        return divi;
    }
}
