/*
Crear un menú interactivo con do ..while y switch
que permita procesar los A.datos principales, B.calcular
el salario con base en el valor hora y las horas trabajadas
y que saque un C. reporte sencillo del cálculo
 */
import java.util.Scanner;

public class Intro_06_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable de control del ciclo
        String opcion="";
        //Variable globales
        String nombres="";
        String apellidos="";
        float horastrabajadas=0;
        float salario=0;
        float VALORHORA=22000;

        //Menú interactivo
        do{
            System.out.println("Bienvenido al software" +
                    " de Cálculo de Salario\n" +
                    "A. Ingresar Datos Básicos\n" +
                    "B. Calcular Salario\n" +
                    "C. Reporte\n" +
                    "D. Salir");
            opcion = sc.next();
            //Implementar el switch
            switch (opcion.charAt(0)){
                case 'a': case 'A':
                    System.out.println("Digite el nombre");
                    nombres = sc.next();
                    System.out.println("Digite los apellidos");
                    apellidos= sc.next();
                    break;
                case 'b': case 'B':
                    System.out.println("Digite la cantidad de horas trabajadas");
                    horastrabajadas = sc.nextInt();
                    salario = horastrabajadas * VALORHORA;
                    break;
                case 'c': case 'C':
                    System.out.println("El valor del salario es:"+salario);
                    break;
                case 'd': case 'D':
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Error Opción Incorrecta.....");
                    break;
            }

        }while(!opcion.equalsIgnoreCase("d"));
    }
}
