import java.util.Scanner;

public class Login{
  public static void main(String args[]){
  
  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Ingrese su nombre de usuario: ");
  usuario = entrada.nextLine();

  System.out.print("Ingrese su password: ");
  password = entrada.nextLine();

  if(usuario.equals("guillermo") && password.equals("123456") ){
  System.out.println("Inicio de sesion correcto");
  } else{System.out.println("Nombre de usuario o password incorrectos");
  }
 }
}