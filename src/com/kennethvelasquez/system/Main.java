package com.kennethvelasquez.system;

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
        
        System.out.println("Tabla de"
+ " multiplicar del " + numero + ":");
        
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





    /**
     * Problema 30:
     * Define un año y determina si es bisiesto.
     *
     * Regla simplificada:
     * Un año divisible entre 4 puede considerarse bisiesto.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 30 anio bisiesto"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 30" \
     * --body "Se agregó una validación para determinar si un año es divisible entre cuatro."
     */
    public static void estructuraBaseEjercicio30() {
        
            
            
             int numero = 5;

    for (int jijijija= 1; jijijija <= numero; jijijija++) {
        System.out.println(jijijija);
    }
}
        


        /**
 * Problema 31:
 * Define un número entero positivo y cuenta cuántos números
 * existen desde 1 hasta ese número.
 *
 * Debes mostrar cada número utilizando un ciclo.
 */

   
       

    
    


    /**
     * Problema 31:
     * Define un número entero positivo y cuenta cuántos números
     * existen desde 1 hasta ese número.
     *
     * Debes mostrar cada número utilizando un ciclo.
     *
     * Ejemplo:
     * numero = 5
     *
     * 1
     * 2
     * 3
     * 4
     * 5
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 31 conteo numeros"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 31" \
     * --body "Se implementó un ciclo que muestra todos los números desde uno hasta un límite definido."
     */
    public static void estructuraBaseEjercicio31() {

    }


    /**
     * Problema 32:
     * Crea un arreglo con las siguientes notas:
     *
     * {70, 85, 45, 90, 60}
     *
     * Recorre el arreglo y cuenta:
     *
     * - Cuántos estudiantes aprobaron.
     * - Cuántos estudiantes reprobaron.
     *
     * Una nota igual o mayor a 60 se considera aprobada.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente,
     * borra esta sección del comentario.
     *
     * git add Main.java
     * git commit -m "feat: resolver problema 32 aprobados reprobados"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \
     * --title "Resolver problema 32" \
     * --body "Se recorrió un arreglo de notas para contabilizar estudiantes aprobados y reprobados."
     */
    public static void estructuraBaseEjercicio32() {

    }
    }


