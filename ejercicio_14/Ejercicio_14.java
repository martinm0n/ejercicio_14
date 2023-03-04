
package com.mycompany.ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        int X = entrada.nextInt();
        double Y = Math.pow(X, 2);
        System.out.println("su numero elevado al cuadrado es " + Y);
        double Z = Math.pow(X, 3);
        System.out.println("su numero elevado al cubo es " + Z);
    }
}
