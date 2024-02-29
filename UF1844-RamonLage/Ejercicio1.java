/* Escribe un programa que lea un array de números enteros e imprima en la consola el número más pequeño*/

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numerosEnteros = { 9, 5, 9, 12, 7, 20, 15, 10, 6, 18, 25, 14, 8, 58, 19, 22, 11, 2, 17, 16 };
        int numMenor = numerosEnteros[0];

        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] < numMenor) {
                numMenor = numerosEnteros[i];
            }
        }

        System.out.println("El número más pequeño del array es: " + numMenor);

    }
}