//1.4) Dado el valor del radio de una circunferencia, la computadora muestra el valor
//de su superficie y su perímetro.

import java.util.Scanner;
public class Circunferencia{
 public static void main(String[] args){

  Scanner entrada = new Scanner(System.in);
  float radio = 0;

  System.out.println("Indique el valor del radio: ");
  radio = entrada.nextFloat();

  System.out.println("El valor del perimetro es de: " + ( (2 * 3.14) * radio  )   );
  System.out.println("El valor del area de un circulo es de: " + (3.14 * radio * radio)    );
 }
}
