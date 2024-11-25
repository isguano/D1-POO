

package com.mycompany.d1.recuperacion_poo;

import java.util.Scanner;

public class D1Recuperacion_POO {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero;

        System.out.println("Digite el número del que desea generar la tabla: ");

        numero = lector.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("El número ingresado es incorrecto. Intente nuevamente.");
        }
    }
}
