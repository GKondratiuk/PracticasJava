//TECNICAS DE PROGRAMACION 
//ESTRUCTURA SECUENCIAL 

//1.2) Dados el valor de una hora de trabajo y la cantidad de horas trabajadas por dia
//la computadora muestra el valor del sueldo diario. 
import java.util.Scanner;

public class EjercicioDos{
public static void main(String args[]){

Scanner entrada = new Scanner(System.in);
int Vhora = 0;
int Chora = 0;

System.out.println("Tipee el valor de la hora de trabajo");
Vhora = entrada.nextInt();

System.out.println("Tipee la cantidad de horas trabajadas");
Chora = entrada.nextInt();

System.out.println("Su trabajo ah generado un ingreso de $" + (Vhora * Chora) );


 }
}
