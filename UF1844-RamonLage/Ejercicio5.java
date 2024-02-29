/* Escribe un programa que simule el lanzamiento de un dado 100 veces y cuente la cantidad de veces que se obtiene un número par. */

public class Ejercicio5 {
    public static void main(String[] args) {

        int contador = 0;
        
        System.out.println("Valores en 100 tiradas de un dado:");
        for (int i = 0; i < 100; i++) {
            // fórmula para obtener aleatorios entre dos números (ambos incluidos), (int) (Math.floor(Math.random()*(N-M+1)+M)); M para el menor, N para el mayor.
            int tiradaDado = (int) (Math.floor(Math.random()*(6-1+1)+1)); 
            if(tiradaDado%2 == 0){
                contador++;
            }
            System.out.print(" "+tiradaDado+ " ");
        }

        System.out.println("\nHan salido "+ contador+ " veces un número par.");
    }
}
