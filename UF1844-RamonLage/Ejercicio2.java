/*Escribe un programa que lea un array de números enteros
 e imprima en la consola todos los números primos del array */

 public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numerosEnteros = { 9, 5, 9, 12, 7, 20, 15, 10, 6, 18, 25, 14, 8, 58, 19, 22, 11, 4, 17, 16 };
        boolean numPrimo = true;
        
        for (int i = 0; i < numerosEnteros.length; i++) {
            numPrimo = true;

            for (int j = 2; j < numerosEnteros[i]; j++) {
                // Si hay algún número que sea divisor de número que se valora, entonces se cambia a numPrimo= false y se corta el bucle.                
                if (numerosEnteros[i] % j == 0) {
                    numPrimo = false; 
                    break;
                }
            }
        
            if (numPrimo) {
                System.out.println("El número: " + numerosEnteros[i] + " es primo.");
            }
        }
    }
}
