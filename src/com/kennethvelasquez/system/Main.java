package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        estructuraBaseEjercicio23();
        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
<<<<<<< HEAD
        estructuraBaseEjercicio24();
=======
        estructuraBaseEjercicio29();
        
        
        estructuraBaseEjercicio16();
>>>>>>> e69c85e5257bf41a8fd7f0cf9c6a000a5ca5cd26
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

<<<<<<< HEAD

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


    /**
     * Problema 23:
     * Crea un arreglo con 5 números enteros y muestra todos sus elementos.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 23 recorrer arreglo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 23" \
     * --body "Se creó un arreglo de números enteros y se agregó un recorrido para mostrar sus elementos."
     */
    public static void estructuraBaseEjercicio23() {

    }


    
    public static void estructuraBaseEjercicio24() {
    int[] numeros = {12, 5, 8, 20, 15};
    int suma = 0;
    
    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
    


    /**
     * Problema 25:
     * Crea un arreglo con 5 números enteros y encuentra el número mayor.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 25 mayor arreglo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 25" \
     * --body "Se agregó un recorrido para encontrar el valor mayor almacenado dentro de un arreglo."
     */
    public static void estructuraBaseEjercicio25() {

    }


    /**
     * Problema 26:
     * Crea un arreglo con 5 números enteros y cuenta cuántos son pares.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 26 contar pares"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 26" \
     * --body "Se implementó un recorrido para contar cuántos números pares existen en un arreglo."
     */
    public static void estructuraBaseEjercicio26() {

    }


    /**
     * Problema 27:
     * Define el precio de un producto.
     * Si el precio es mayor a Q100, aplica un descuento del 10%.
     * Muestra el precio original, descuento y precio final.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 27 descuento producto"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 27" \
     * --body "Se agregó una condición para aplicar un descuento del 10 por ciento cuando el precio supera Q100."
     */
    public static void estructuraBaseEjercicio27() {

    }


    /**
     * Problema 28:
     * Define un salario mensual.
     *
     * Si el salario es menor a Q3000, agrega un bono de Q500.
     * Si es igual o mayor a Q3000, no recibe bono.
     *
     * Muestra el salario final.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 28 bono salario"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 28" \
     * --body "Se implementó una condición para asignar un bono dependiendo del salario del trabajador."
     */
    public static void estructuraBaseEjercicio28() {

    }


    /**
     * Problema 29:
     * Define una nota entre 0 y 100 y muestra su clasificación:
     *
     * 90 - 100 = Excelente
     * 80 - 89  = Muy bueno
     * 70 - 79  = Bueno
     * 60 - 69  = Aprobado
     * 0 - 59   = Reprobado
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 29 clasificar nota"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 29" \
     * --body "Se implementó una estructura condicional para clasificar una nota según diferentes rangos."
     */
=======
>>>>>>> e69c85e5257bf41a8fd7f0cf9c6a000a5ca5cd26
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
