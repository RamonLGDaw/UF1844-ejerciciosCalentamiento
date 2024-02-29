/*Escribe un programa que lea un array de números enteros e imprima en consola los números ordenados de manera ascendente */

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numerosEnteros = { 9, 5, 9, 12, 7, 20, 15, 10, 6, 18, 25, 14, 8, 58, 19, 22, 11, 2, 17, 16 };
        
        Arrays.sort(numerosEnteros);
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println(numerosEnteros[i]);
        }
    }
}
