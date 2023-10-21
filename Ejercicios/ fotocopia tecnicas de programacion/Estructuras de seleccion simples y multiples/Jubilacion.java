import java.util.Scanner;
 
public class Jubilacion{
  public static void main(String args []){

  Scanner entrada = new Scanner(System.in);
  int edad = 0;
  String genero = "";

  System.out.println("Indique su genero M/F");
  genero = entrada.nextLine();
  System.out.println("Indique su edad");
  edad = entrada.nextInt();
  
  if(genero.equals("M") || genero.equals("m") && edad >= 70){
   System.out.println("usted está en edad de jubilarse");
   }else if(genero.equals("F") || genero.equals("f") && edad >= 65){
   System.out.println("usted está en edad de jubilarse");
  }else{
   System.out.println("usted no está en edad de jubilarse");
   }

 }
}
