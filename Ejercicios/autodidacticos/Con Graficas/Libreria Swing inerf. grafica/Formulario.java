//Libreria javax swing es para crear interfaces graficas.
//el asterisco para decirle que vamos a importar todos los elementos

import javax.swing.*;

//extends JFrame ''extends'' nos sirve para importar clases que han creado otras personas
//la clase que importamos es la ''JFrame'' que está en el jdk y nos permite crear
//interfraces gráficas, es el contendor donde van a ir todos nuestros elementos 

public class Formulario extends JFrame{

//JLabel nos permite crear etiquetas, muestra datos en la interfaz grafica
//''private'' es un modificador de acceso y sirve  para indicar que es un espacio privado
//los label siempre deben ser privados

private JLabel label1;

//constructor debe llamarse igual que el nombre de la clase 
public Formulario(){
//METODO setLayout nos permite indicarle al programa que por medio de coordenadas vamos a colo-
//-car elementos. 

   setLayout(null);

//mensaje de la etiqueta
   label1 = new JLabel("La Geekipedia de Ernesto");
//coordenadas de la etiqueta  
//coordenadas X, Y, ANCHO Y ALTO (en ese orden)
   label1.setBounds(10,20,200,300);
   add(label1); 
}
  public static void main(String args[]){
// creación de objeto tipo formulario objeto ,clase y constructor todo con el mismo nombre
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,300);
//para que la interfaz se vea hay que poner true, sino false
  formulario1.setVisible(true);
//con esto indicamos que la interfaz aparezca al centro de la pantalla
  formulario1.setLocationRelativeTo(null);
}
}
