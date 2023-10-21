//TECNICAS DE PROGRAMACION 
//ESTRUCTURA SECUENCIAL 

//1.1) Ingresar un numero y que la computadora muestre su opuesto y su inverso 
import java.util.Scanner;

public class EjercicioUno{
public static void main(String args[]){

Scanner entrada = new Scanner (System.in);
float numero = 0;

System.out.println("Ingrese un numero");
numero = entrada.nextInt();

System.out.println("El opuesto del numero: " + numero + " es: " + (numero - (numero * 2))  );
System.out.println("Y el inverso es: " + (1 / numero)  );
 }
}
