package org.example;

public class Main {
    public static void main(String[] args) {

        //Enteros:
        byte number1 = 1; // 1 byte
        System.out.println(number1);
        short number2 = 2; // 2 byte
        System.out.println(number2);
        int number3 = 3; // 4 byte
        System.out.println(number3);
        long number4 = 4; // 8 byte
        System.out.println(number4);

        // Punto Decimal o Flotante:
        float decimal1 = 4.9f;
        System.out.println(decimal1);
        double decimal2 = 9.99d;
        System.out.println(decimal2);

        // Carater:
        char caracter1 = 'a';
        System.out.println(caracter1);

        // Booleanos
        boolean verdadero = true;
        System.out.println(verdadero);
        boolean falso = false;
        System.out.println(falso);

        // Cadenas de texto
        String nombre = "Alan";
        System.out.println(nombre);
        String apellido = "Sastre";
        System.out.println(apellido);

        // Tipos Envoltorios
        Integer numero = null; //Utilizado más para bases de datos.
        System.out.println(numero);
        long numero4 = 4L;
        System.out.println(numero4);

    }
}