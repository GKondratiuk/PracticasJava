import java.util.Scanner;
public class Positivo{
public static void main(String args[]){

Scanner entrada = new Scanner(System.in);
int numero = 0;

System.out.println("Tipee un numero");
numero = entrada.nextInt();
if(numero >= 0){
System.out.println("El numero: " + numero + " es un numero positivo");
}else{
System.out.println("Su numero " + numero + " es un numero negativo");
}

 }
}
