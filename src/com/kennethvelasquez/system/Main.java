package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        estructuraBaseEjercicio23();
        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
        estructuraBaseEjercicio29();
    }

  
    public static void estructuraBaseEjercicio22() {

    }
    
    public static void estructuraBaseEjercicio23() {
        int[] numeros = {10, 25, 30, 42, 55};

        for (int numero : numeros) {
            System.out.println(numero);
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
