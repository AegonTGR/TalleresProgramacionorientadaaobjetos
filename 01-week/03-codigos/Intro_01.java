
/*
Autor: Ing. Julian Quimbayo Castro
Versión: 1.0
Descripción: Este es la introducción a Java variables, constantes, sintáxis y Condicionales.
 */
//Importación de clase para pedir información

import java.util.Scanner;

public class Intro_01 {
    //Método principal de ejecución
    public static void main(String[] args) {
        //Montaje de la librería Scanner
        Scanner sc = new Scanner(System.in);
        //Declararla e inicializar variables - Datos primitivos / Datos Objeto
        int numero=0;
        int numerodos=0;
        int resultado=0;
        float decimal=0;
        String nombres="";
        char letra='r';
        boolean estado=true;
        //Declarar una constante - Fijo
        double IVACOMPRA=0.16;
        //Forma de mostrar un mensaje al usuario
        System.out.println("Hola mundo! :) ");

        //Suma Básica
        System.out.println("Ingrese el número uno:");
        numero = sc.nextInt();
        System.out.println("Ingres el número dos");
        numerodos = sc.nextInt();
        resultado = numero+numerodos;
        System.out.println("El resultado es: "+ resultado);
    }
}
