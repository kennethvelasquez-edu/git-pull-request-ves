package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        estructuraBaseEjercicio23();
        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
         estructuraBaseEjercicio7();

        estructuraBaseEjercicio29();
        
        
        estructuraBaseEjercicio16();
    

         estructuraBaseEjercicio7();

    }


    /**
     * Problema 1:
     * Solicita o define dos números enteros y muestra la suma de ambos.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 1 suma de numeros"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 1" \
     * --body "Se implementó la lógica necesaria para sumar dos números enteros y mostrar el resultado."
     */
    public static void estructuraBaseEjercicio1() {

    }


    /**
     * Problema 2:
     * Define dos números enteros y muestra cuál de los dos es mayor.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 2 numero mayor"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 2" \
     * --body "Se agregó una comparación entre dos números para determinar cuál es mayor."
     */
    public static void estructuraBaseEjercicio2() {

    }


    /**
     * Problema 3:
     * Define un número entero y determina si es positivo, negativo o cero.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 3 signo numero"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 3" \
     * --body "Se implementó la validación para identificar si un número es positivo, negativo o cero."
     */
    public static void estructuraBaseEjercicio3() {

    }


    /**
     * Problema 4:
     * Define un número entero y determina si es par o impar.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 4 par impar"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 4" \
     * --body "Se agregó la lógica para determinar si un número entero es par o impar."
     */
    public static void estructuraBaseEjercicio4() {

    }


    /**
     * Problema 5:
     * Define tres números enteros y muestra cuál de ellos es el mayor.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 5 mayor de tres"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 5" \
     * --body "Se implementó la comparación de tres números para encontrar el valor mayor."
     */
    public static void estructuraBaseEjercicio5() {

    }


    /**
     * Problema 6:
     * Define la edad de una persona y determina si es mayor o menor de edad.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 6 mayoria edad"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 6" \
     * --body "Se agregó una condición para determinar si una persona es mayor o menor de edad."
     */
    public static void estructuraBaseEjercicio6() {
        
    }


    /**
     * Problema 7:
     * Define una temperatura en grados Celsius y conviértela a Fahrenheit.
     *
     * Fórmula:
     * Fahrenheit = (Celsius * 9 / 5) + 32
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 7 conversion temperatura"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 7" \
     * --body "Se implementó la conversión de grados Celsius a grados Fahrenheit."
     */
    public static void estructuraBaseEjercicio7() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" bienvenido a tu app donde trasformas grados celsius a a farenheit");
        System.out.println("------------------------------------------------------------------");
        System.out.println("ingrese su grados celsius");
        int grados = scanner.nextInt();
        
        int result;
        result = (grados + (9/5) )+32;
        
        
        
        System.out.println("su resultado es  "
                              + result );
        
    }


    
    public static void estructuraBaseEjercicio22() {

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
