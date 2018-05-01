package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("La calificación de " + args[0] + ": ");
        String resul=Main.veredicto(args[1], args[2]);
        System.out.println(resul);

    }

    /**
     *
     * @param valor1: valor de la primera nota introduccida
     * @param valor2: valor de la segunda nota introduccida
     * @return resultado de las diferentes comparaciones de las notas realizadas. Es el dato que se devuelve al metodo main.
     */
    private static String veredicto(String valor1, String valor2) {
        System.out.println("valor1:  " + valor1);
        System.out.println("valor2:  " + valor2);

        if (valor1.equals(valor2)) {
            return "perfecto. Has tenido buen criterio.";

        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado. o te ha llegado éxito inesperado.";
        }
        return "Te has confiado. Falta realismo";
    }
}
