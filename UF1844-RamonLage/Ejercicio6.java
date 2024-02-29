/*Escribe un programa que lea un array de números enteros y determine si el array está ordenado de forma ascendente */

public class Ejercicio6 {
    public static void main(String[] args) {

        // Para hace pruebas hay el mismo array ordenado ascendente y desordenado
        int[] numerosEnteros = { 9, 5, 9, 12, 7, 20, 15, 10, 6, 18, 25, 14, 8, 58, 19, 22, 11, 2, 17, 16 };
        // int[] numerosEnteros = { 2, 5, 6, 7, 8, 9, 9, 10, 11, 12, 14, 15, 16, 17, 18,
        // 19, 20, 22, 25, 58 };

        boolean arrayOrdenado = true;

        // Se ha de ajustar a numerosEnteros.length - 1 para que en la última iteración
        // del bucle for, se valore si el penúltimo valor el mayor que el último valor.
        // Sin el -1 se intenta acceder a un índice que no existe y da error.
        for (int i = 0; i < numerosEnteros.length - 1; i++) {
            if (numerosEnteros[i + 1] < numerosEnteros[i]) {
                arrayOrdenado = false;
                break;
            }
        }

        if (arrayOrdenado) {
            System.out.println("El array esta ordenado de forma ascendente.");
        } else {
            System.out.println("El array NO esta ordenado de forma ascendente.");
        }

    }
}
