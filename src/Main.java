package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {
    public static void estructuraBaseEjercicio10() {
        // Definición de las tres notas
        double nota1 = 75.0;
        double nota2 = 80.0;
        double nota3 = 65.5;

        // Cálculo del promedio
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar el promedio obtenido
        System.out.println("Promedio: " + promedio);

        // Validación de aprobación (>= 60)
        if (promedio >= 60.0) {
            System.out.println("¡El estudiante aprobó!");
        } else {
            System.out.println("El estudiante no aprobó.");
        }
    }
}
