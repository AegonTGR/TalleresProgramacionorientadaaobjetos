
import java.util.Scanner;


public class Intro_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="";
        String apellidos="";
        int edad=0;
        int ANIO=2026;
        int anios=0;

        //Capturar los datos
        System.out.println("Digite el nombre:");
        nombre = sc.next();
        System.out.println("Digite los apellidos");
        apellidos = sc.next();
        System.out.println("Digite la edad");
        edad = sc.nextInt();

        //Calcular los años de la persona
        anios = ANIO - edad;
        System.out.println("La antiguedad de la persona es:"+anios);

    }
}
