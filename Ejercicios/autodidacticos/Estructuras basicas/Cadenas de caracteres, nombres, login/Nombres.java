import java.util.Scanner;

public class Nombres{
  public static void main(String args[]){

  String nombre1 = "", nombre2 = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Por favor ingresa el primer nombre: ");
  nombre1 = entrada.nextLine();

  System.out.print("Por favor coloque el segundo nombre: ");
  nombre2 = entrada.nextLine();

//IgnoreCase es para ignorar entre mayus y minus

  if(nombre1.equalsIgnoreCase(nombre2) ){
  System.out.println("Los nombres son iguales");
   }else{
    System.out.println("Los nombres son diferentes");
  }
 }
}