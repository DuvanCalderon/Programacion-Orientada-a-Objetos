package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = entrada.nextDouble();

        double area = Math.PI * radio * radio;
        double longitudCircunferencia = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);

    }
}
