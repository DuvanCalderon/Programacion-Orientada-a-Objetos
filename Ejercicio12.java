package Ejercicio12;



public class Ejercicio12 {


    public static void main(String[] args) {
      
        int horasTrabajadas = 48;
        double tarifaPorHora = 5000;
        double porcentajeRetencion = 12.5;

        
        double salarioBruto = horasTrabajadas * tarifaPorHora;
        double retencionFuente = (salarioBruto * porcentajeRetencion) / 100;
        double salarioNeto = salarioBruto - retencionFuente;

        
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la Fuente: $" + retencionFuente);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
