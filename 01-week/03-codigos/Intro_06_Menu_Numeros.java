/*
Crear un menú interactivo con do ..while y switch
que permita procesar los 1.datos principales, 2.calcular
el salario con base en el valor hora y las horas trabajadas
y que saque un 3. reporte sencillo del cálculo
 */
import java.util.Scanner;

public class Intro_06_Menu_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable de control del ciclo
        int opcion=0;
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
                    "1. Ingresar Datos Básicos\n" +
                    "2. Calcular Salario\n" +
                    "3. Reporte\n" +
                    "4. Salir");
            opcion = sc.nextInt();
            //Implementar el switch
            switch (opcion){
                case 1:
                    System.out.println("Digite el nombre");
                    nombres = sc.next();
                    System.out.println("Digite los apellidos");
                    apellidos= sc.next();
                    break;
                case 2:
                    System.out.println("Digite la cantidad de horas trabajadas");
                    horastrabajadas = sc.nextInt();
                    salario = horastrabajadas * VALORHORA;
                    break;
                case 3:
                    System.out.println("El valor del salario es:"+salario);
                    break;
                case 4:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Error Opción Incorrecta.....");
                    break;
            }

        }while(opcion!=4);
    }
}
