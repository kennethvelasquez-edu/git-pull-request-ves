package com.kennethvelasquez.system;



public class Main {

    public static void main(String[] args) {

        // Cada alumno puede llamar temporalmente su método aquí para probarlo.
        // Ejemplo:
        // estructuraBaseEjercicio1();
        estructuraBaseEjercicio9();
    }

    

    /**
     * Problema 9: Define el radio de un círculo y calcula su área.
     *
     * Fórmula: area = PI * radio * radio
     *
     * Puedes utilizar Math.PI.
     *
     * Al resolver el problema y comprobar que ejecuta correctamente, borra esta
     * sección del comentario.
     *
     * git add Main.java git commit -m "feat: resolver problema 9 area circulo"
     * git push origin rama_destino
     *
     * gh pr create --base tu-rama --head rama_destino \ --title "Resolver
     * problema 9" \ --body "Se implementó el cálculo del área de un círculo
     * utilizando su radio."
     */
    public static void estructuraBaseEjercicio9() {

        double radio = 5.0;
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);

    }
}


