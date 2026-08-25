package com.kennethvelasquez.system;


import java.util.Scanner;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        estructuraBaseEjercicio23();
        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
        estructuraBaseEjercicio29();
        
        
        estructuraBaseEjercicio16();
    }


    /**
     * Problema 1:
     * cita o define dos números enteros y muestra la suma de ambos.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *Soli
     * git add Main.java
     * git commit -m "feat: resolver problema 1 suma de numeros"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 1" \
     * --body "Se implementó la lógica necesaria para sumar dos números enteros y mostrar el resultado."
     */
    public static void estructuraBaseEjercicio1() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese su número 1");
            int numero1 = sc.nextInt();
        System.out.println("Ingrese su número 2");
         int  numero2 = sc.nextInt();
           
        int resultado = numero1+numero2;
        System.out.println("El resultado es: "+ resultado);
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

    }


    /**
     * Problema 8:
     * Define la base y altura de un rectángulo y calcula su área.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 8 area rectangulo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 8" \
     * --body "Se agregó el cálculo del área de un rectángulo utilizando su base y altura."
     */
    public static void estructuraBaseEjercicio8() {

    }


    /**
     * Problema 9:
     * Define el radio de un círculo y calcula su área.
     *
     * Fórmula:
     * area = PI * radio * radio
     *
     * Puedes utilizar Math.PI.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 9 area circulo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 9" \
     * --body "Se implementó el cálculo del área de un círculo utilizando su radio."
     */
    public static void estructuraBaseEjercicio9() {

    }


    /**
     * Problema 10:
     * Define tres notas y calcula el promedio.
     * Muestra si el estudiante aprobó.
     *
     * Se considera aprobado si el promedio es mayor o igual a 60.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 10 promedio notas"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 10" \
     * --body "Se calculó el promedio de tres notas y se agregó una validación para determinar si el estudiante aprobó."
     */
    public static void estructuraBaseEjercicio10() {

    }


    /**
     * Problema 11:
     * Define un número del 1 al 7 y muestra el día de la semana correspondiente.
     *
     * Ejemplo:
     * 1 = Lunes
     * 2 = Martes
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 11 dia semana"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 11" \
     * --body "Se agregó una estructura condicional para mostrar el día de la semana correspondiente a un número."
     */
    public static void estructuraBaseEjercicio11() {

    }


    /**
     * Problema 12:
     * Define un número del 1 al 12 y muestra el nombre del mes correspondiente.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 12 nombre mes"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 12" \
     * --body "Se implementó la lógica para obtener el nombre de un mes a partir de su número."
     */
    public static void estructuraBaseEjercicio12() {

    }


    /**
     * Problema 13:
     * Utiliza un ciclo para mostrar los números del 1 al 10.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 13 numeros 1 al 10"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 13" \
     * --body "Se agregó un ciclo para mostrar en pantalla los números del 1 al 10."
     */
    public static void estructuraBaseEjercicio13() {

    }


    /**
     * Problema 14:
     * Utiliza un ciclo para mostrar los números pares del 2 al 20.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 14 numeros pares"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 14" \
     * --body "Se implementó un ciclo que muestra los números pares comprendidos entre 2 y 20."
     */
    public static void estructuraBaseEjercicio14() {

    }


    /**
     * Problema 15:
     * Utiliza un ciclo para mostrar los números del 10 al 1 en orden descendente.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 15 cuenta regresiva"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 15" \
     * --body "Se agregó un ciclo descendente para imprimir los números desde 10 hasta 1."
     */
    public static void estructuraBaseEjercicio15() {

    }


    /**
     * Problema 16:
     * Define un número y muestra su tabla de multiplicar del 1 al 10.
     *
     * Ejemplo para 5:
     * 5 x 1 = 5
     * 5 x 2 = 10
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 16 tabla multiplicar"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 16" \
     * --body "Se implementó un ciclo para generar la tabla de multiplicar de un número."
     */
 

    /**
     * Problema 17:
     * Calcula la suma de los números del 1 al 10 utilizando un ciclo.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 17 suma ciclo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 17" \
     * --body "Se agregó un acumulador para sumar los números comprendidos entre 1 y 10."
     */
    public static void estructuraBaseEjercicio17() {

    }


    /**
     * Problema 18:
     * Define un número entero positivo y calcula su factorial.
     *
     * Ejemplo:
     * 5! = 5 * 4 * 3 * 2 * 1 = 120
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 18 factorial"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 18" \
     * --body "Se implementó el cálculo del factorial de un número utilizando un ciclo."
     */
    public static void estructuraBaseEjercicio18() {

    }


    /**
     * Problema 19:
     * Define una palabra y muestra cuántos caracteres contiene.
     *
     * Utiliza length().
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 19 longitud palabra"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 19" \
     * --body "Se agregó la lógica necesaria para obtener y mostrar la cantidad de caracteres de una palabra."
     */
    public static void estructuraBaseEjercicio19() {

    }


    /**
     * Problema 20:
     * Define un texto y muéstralo completamente en letras mayúsculas.
     *
     * Utiliza toUpperCase().
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 20 texto mayusculas"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 20" \
     * --body "Se implementó la conversión de una cadena de texto a letras mayúsculas."
     */
    public static void estructuraBaseEjercicio20() {

    }


    /**
     * Problema 21:
     * Define dos palabras y determina si son iguales.
     *
     * Utiliza equals().
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 21 comparar palabras"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 21" \
     * --body "Se agregó una comparación entre dos cadenas utilizando el método equals."
     */
    public static void estructuraBaseEjercicio21() {

    }


    /**
     * Problema 22:
     * Define una palabra y muestra su primer carácter.
     *
     * Utiliza charAt().
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 22 primer caracter"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 22" \
     * --body "Se implementó la obtención del primer carácter de una palabra."
     */
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
