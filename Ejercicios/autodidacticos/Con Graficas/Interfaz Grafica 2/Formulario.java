//uso de la libreria swing y al asterico es para importar todos los elementos
import javax.swing.*;

//ponemos "Formulario pero le podemos poner cualquier nombre"
public class Formulario extends JFrame{
//extends es una herencia(es un codigo que ya fue escrito por alguien mas, en este caso es el codigo JFrame que pertenece a la libreria swing )
//Jframe nos ayuda a crear la pantalla de la interface y esta es heredada por FORMULARIO


//este es nuestro CONSTRUCTOR: dentro de el, van los elementos que nosotros vamos a colocar dentro de nuestra interfaz gráfica - es publico para que se pueda integrar al jframe.
//setLayout nos ayuda a indicarle al programa que vamos a ser uso de coordenadas.
public Formulario(){
  setLayout(null);
 }


//ARRANQUE - metodo main:
public static void main(String args []){

//Creacion de objeto 
//Formulario con la herencia del jframe pertenece a un objeto, como el Scanner
  Formulario formulario1 = new Formulario();

//metodo setBounds creador de coordenadas para la interface
  formulario1.setBounds(350,100,800,550);
  formulario1.setVisible(true);
  // con el siguiente comandocuando se ejecute la interfaz sin importar 
  //las coordenadas, se ejecutara al medio de la pantalla
  formulario1.setLocationRelativeTo(null);
  //para que el usuario no cambie le tamaño de la interfaz
  formulario1.setResizable(false);
 }
}
