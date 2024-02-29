/*Escribe un programa que lea un array de strings e imprima la cantidad de elementos que contienen una letra especificada por el usuario. */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String[] arrayTexto = { "perro", "gato", "elefante", "ballena", "ratón", "jirafa", "paloma" };

        Scanner entradaValores = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        String letra = entradaValores.next();
        int contador = 0;

        for (int i = 0; i < arrayTexto.length; i++) {
            if (arrayTexto[i].contains(letra)) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " cadenas que contienen la letra "+ letra +".");
        entradaValores.close();
    }
}
