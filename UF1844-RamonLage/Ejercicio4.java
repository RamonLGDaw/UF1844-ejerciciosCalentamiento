/*Escribe un programa que lea un array de cadenas de texto y encuentre la cantidad de palabras que tienen más de 5 caracteres */

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] arrayTexto = { "perro", "gato", "elefante", "ballena", "ratón", "jirafa", "paloma" };
        int contador = 0;
        for (int i = 0; i < arrayTexto.length; i++) {
            if (arrayTexto[i].length() > 5) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " cadenas que tienen más de 5 caracteres.");
    }
}
