package Ejercicio14;

import java.util.Scanner;

public class Ejericcio14 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        int cuadrado = numero * numero;
        int cubo = numero * numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        
    }
}
