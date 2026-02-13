
import java.util.Scanner;
/*
Se desea indagar sobre la entrega de un bono de cumpleaños para las personas que cumplan las siguientes condiciones:
1. >=18 y <=35 => 10%
2. >=36 y <=50 => 20%
3. >51 y <=100 => 50%
Este bono será sobre un salario de base.
Calcular el valor porcentual del bono y el total con el salario.
 */
public class Intro_03_Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarar Variables
        String nombres="";
        String apellidos="";
        int edad=0;
        float salario=0;
        float PORDIEZ=0.10f;
        float PORVEINTE=0.20f;
        float PORCIN=0.50f;
        float totalSalario=0;
        float porcentaje=0;
        //Captura de datos
        System.out.println("Digite el nombre de la persona:");
        nombres = sc.next();
        System.out.println("Digite los apellidos de la persona");
        apellidos= sc.next();
        System.out.println("Digite el salario de la persona:");
        salario= sc.nextFloat();
        System.out.println("Digite la edad de la persona:");
        edad = sc.nextInt();
        //Cálculos
        if(edad >=18 & edad <=35){
            totalSalario = salario + (salario * PORDIEZ);
            porcentaje = salario * PORDIEZ;
            System.out.println("El porcentaje del bono fue: $."+porcentaje+"\n" +
                    "El salario final de: "+nombres+" "+apellidos+ "fue:"+totalSalario);
        }else if(edad >=36 & edad <=50){
            totalSalario = salario + (salario * PORVEINTE);
            porcentaje = salario * PORDIEZ;
            System.out.println("El porcentaje del bono fue: $."+porcentaje+"\n" +
                    "El salario final de: "+nombres+" "+apellidos+ "fue:"+totalSalario);
        }else if(edad >51 & edad <=100){
            totalSalario = salario + (salario * PORCIN);
            porcentaje = salario * PORDIEZ;
            System.out.println("El porcentaje del bono fue: $."+porcentaje+"\n" +
                    "El salario final de: "+nombres+" "+apellidos+ "fue:"+totalSalario);
        }else{
            System.out.println("No obtuvo bono"+"\n" +
                    "El salario final de: "+nombres+" "+apellidos+ "fue:"+salario);
        }
    }
}
