import javax.swing.*;

public class Formulario extends JFrame{
  
//creacion de etiqueta
//por lo general los label son privados porque unicamente esta clase que estamos creando va a tener acceso a esta etiqueta
 private JLabel label1;
 private JLabel label2;

//Creacion de constructor
public Formulario(){
 setLayout(null);
 
//creacion de objeto
label1 = new JLabel("Interfaz Gráfica.");
//creacion de coordenadas
label1.setBounds(10,20,300,30);
//metodo add - important e porque sino no nos va a mostrar la eituqeta
add(label1);

//creacion de segundo objeto

label2 = new JLabel("Version 1.0");
label2.setBounds(10,100,100,30);
add(label2);
}

//creacion de ARRANQUE
public static void main(String args[]){

//creacion de Objeto para extraer del JFrame
Formulario formulario1 = new Formulario();
formulario1.setBounds(0,0,300,200);
//para que no se pueda modificar el tamaño
formulario1.setResizable(false);
formulario1.setVisible(true);
//para que se muestre en el centro de la pantalla 
formulario1.setLocationRelativeTo(null);
 } 
}
