//TECNICAS DE PROGRAMACION 
//ESTRUCTURA SECUENCIAL 

import java.util.Scanner;
public class Celsius{
public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  double grados = 0;
 
  System.out.println("Coloque los celsius que desa pasar a farenheit...");
  grados = entrada.nextDouble();

  System.out.println("son: " + ( (grados * 9/5) + 32 )  + " Grados Farenheit" );
  
 }
}
