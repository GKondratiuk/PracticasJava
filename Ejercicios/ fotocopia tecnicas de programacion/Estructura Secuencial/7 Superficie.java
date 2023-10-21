//Dada la superficie de un cuadrado (en m2) 
//la pc muestra su perimetro

import java.util.Scanner;
public class Superficie{
  public static void main(String args[]){
  
  Scanner entrada = new Scanner(System.in);
  double superficie = 0;

  System.out.println("Tipee el valor de una superficie x    metro al cuadrado: " );
  superficie = entrada.nextDouble();

  System.out.println("Posee un perimetro de: " + superficie * 4);
  
 }
}

