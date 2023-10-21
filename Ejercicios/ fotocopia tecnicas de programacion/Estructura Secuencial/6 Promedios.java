//TECNICAS DE PROGRAMACION 
//ESTRUCTURA SECUENCIAL 

// 1.6 Dadas tres notas pertenecientes a tres trimestres distintos, la computadora muestra la nota promedio

import java.util.Scanner;

public class Promedios {
  public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  double nota1, nota2, nota3;
  double promedio;

  System.out.println("Tipee la primer nota...");
  nota1 = entrada.nextInt();
  System.out.println("Tipee segunda nota");
  nota2 = entrada.nextInt();
  System.out.println("Tipee la tercer nota");
  nota3 = entrada.nextInt();
  promedio = (nota1 + nota2 + nota3) / 3;
  System.out.println("El promedio del alumno es: " + promedio);

 }
}
