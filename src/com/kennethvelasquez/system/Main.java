package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        estructuraBaseEjercicio28();
    }
    
    public static void estructuraBaseEjercicio28() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su Salario Mensual:");
        double salarioMensual = scanner.nextDouble();

        if (salarioMensual < 3000) {
            salarioMensual = salarioMensual + 500;
        }

        System.out.println("Su salario es de: Q" + salarioMensual);

        scanner.close();
    }
    
}
