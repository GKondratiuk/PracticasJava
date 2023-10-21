//TECNICAS DE PROGRAMACION 
//ESTRUCTURA SECUENCIAL 

//1.3) Dados los valores de dos de los angulos interiores de un triangulo, la computadora muestra el valor del restante.
 
import java.util.Scanner;

public class EjercicioTres{
public static void main(String args[]){

Scanner entrada = new Scanner (System.in);
int v1 = 0;
int v2 =0;

System.out.println("Ingrese el primer valor");
v1 = entrada.nextInt();
System.out.println("Ingrese el segundo valor");
v2 = entrada.nextInt();

System.out.println("El valor del angulo restante es: " + ( 180 - (v1 + v2)) );
 }
}
