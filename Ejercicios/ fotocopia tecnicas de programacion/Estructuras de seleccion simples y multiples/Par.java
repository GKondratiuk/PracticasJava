import java.util.Scanner;

public class Par{
  public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  int numero = 0;

  System.out.println("Tipee un numero...");
  numero = entrada.nextInt();
    if( numero % 2 == 0){
    System.out.println("El numero " + numero +  " es par");
    }else{
    System.out.println("El numero " +  numero + " es impar");
}




 }
}
