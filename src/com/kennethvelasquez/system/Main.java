package com.kennethvelasquez.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
        estructuraBaseEjercicio29();
    }

    /**
     * Problema 29: Define una nota entre 0 y 100 y muestra su clasificación:
     *
     * 90 - 100 = Excelente 80 - 89 = Muy bueno 70 - 79 = Bueno 60 - 69 =
     * Aprobado 0 - 59 = Reprobado
     *
     * Al resolver el problema y comprobar que ejecuta correctamente, borra esta
     * sección del comentario.
     *
     * git add Main.java git commit -m "feat: resolver problema 29 clasificar
     * nota" git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \ --title "Resolver
     * problema 29" \ --body "Se implementó una estructura condicional para
     * clasificar una nota según diferentes rangos."
     */
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
