//1.5) Dados dos valores para cada cateto de un triángulo rectángulo, la computadora
//calcula y muestra el valor de la hipotenusa.

import java.util.Scanner;
public class Triangulo {
  public static void main (String[] args) {
  
  Scanner entrada = new Scanner(System.in);
  int valorUno = 0;
  int valorDos = 0;
  double resultado = 0;
  double raiz = 0;
  System.out.println("Indique el primer valor");
  valorUno = entrada.nextInt();

  System.out.println("Indique el segundo valor");
  valorDos = entrada.nextInt();
  
  resultado = (valorUno * valorUno) + (valorDos * valorDos);

  System.out.println("El valor de la hipotenusa es de: " + (raiz = Math.sqrt(resultado) ) );
 }
}
