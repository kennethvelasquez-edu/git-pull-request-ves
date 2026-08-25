package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

public static void main(String args []){
   

    

        estructuraBaseEjercicio23();
        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
        estructuraBaseEjercicio29();
        
        
        estructuraBaseEjercicio16();
    }



  

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

    

    
    
    
    
    
    public static void estructuraBaseEjercicio23() {
        int[] numeros = {10, 25, 30, 42, 55};

        for (int numero : numeros) {
            System.out.println(numero);
        }


        for (int numero : numeros) {
            System.out.println(numero);

        }
    }
    public static void estructuraBaseEjercicio16() {
        int numero =7 ;
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {     
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void estructuraBaseEjercicio29() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Calificacion: ");

        int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 80) {
            System.out.println("Muy bueno");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

}
