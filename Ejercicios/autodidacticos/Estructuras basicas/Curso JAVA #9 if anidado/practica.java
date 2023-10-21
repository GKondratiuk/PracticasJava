import java.util.Scanner;

public class Practica{
 public static void main(String args[]){
 
  Scanner in = new Scanner(System.in);
  String nombre = "";
  int clave = 0;
  int antiguedad = 0;

 System.out.println("****************************************************");
 System.out.println("Bienvenido al sistema vacacional de Cocacola Company");
 System.out.println("****************************************************");
 System.out.println("");
 System.out.println("Cual es el nombre del trabajador?");
 nombre = in.nextLine();
 
 System.out.println("tiempo de empleo en la empresa?");
 antiguedad = in.nextInt();
 
 System.out.println("Cual es la clave de su departamento ?");
 clave= in.nextInt();

 if(clave == 1){

 if(antiguedad == 1){
 System.out.println(nombre + " Tiene 6 dias de vacaciones ");
	
}else if(antiguedad >=2 && antiguedad <=6){
System.out.println(nombre + " Tiene 14 dias de vacaciones ");

}else if(antiguedad >= 7){
System.out.println(nombre +" Tiene 20 dias de vacaciones ");

}else{
System.out.println(nombre + " Aun no tiene derecho a vacaciones ");
}


}else if(clave == 2){

 if(antiguedad == 1){
 System.out.println(nombre + " Tiene 7 dias de vacaciones ");	

}else if(antiguedad >=2 && antiguedad <=6){
System.out.println(nombre + " Tiene 15 dias de vacaciones ");

}else if(antiguedad >= 7){
System.out.println(nombre + " Tiene 22 dias de vacaciones ");

}else{
System.out.println(nombre + " Aun no tiene derecho a vacaciones ");

}


}else if (clave == 3){

 if(antiguedad == 1){
 System.out.println(nombre + " Tiene 10 dias de vacaciones ");	

}else if(antiguedad >=2 && antiguedad <=6){
System.out.println(nombre + " Tiene 20 dias de vacaciones ");

}else if(antiguedad >= 7){
System.out.println(nombre + " Tiene 30 dias de vacaciones ");

}else{
System.out.println(nombre + " Aun no tiene derecho a vacaciones ");

}


}else{
System.out.println("Error la clave del departamento no existe");


  }
 }
} 