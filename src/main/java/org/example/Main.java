package org.example;

public class Main {
    public static void main(String[] args) {

        //Enteros:
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; // 8 byte
        System.out.println("Numeros enteros, byte: "+ number1 + ", short: " + number2 + ", int: " + number3 + ", long: " + number4);

        // Punto Decimal o Flotante:
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;
        System.out.println("Numero flotante: " + decimal1 + ", Numero decimales: " + decimal2);

        // Carater:
        char caracter1 = 'a';
        System.out.println("Tipo caracter: " + caracter1);

        // Booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Booleanos: " + verdadero + " o " + falso);

        // Cadenas de texto
        String nombre = "Alan";
        String apellido = "Sastre";
        System.out.println("Cadenas de texto, String: " + nombre + " " +apellido);

        // Tipos Envoltorios
        Integer numero = null; //Utilizado más para bases de datos.
        long numero4 = 4L;
        System.out.println("Numero tipo envoltorio, Integer: " + numero + ", numero long: " + numero4);

    }
}