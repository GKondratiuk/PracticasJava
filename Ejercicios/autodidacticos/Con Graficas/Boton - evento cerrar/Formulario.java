//vamos a programar un boton. primero se programa el diseño y luego la funcionalidad

//permite importar componentes, diseño de nuestra interfaz grafica
import javax.swing.*;
//controla los eventos de los componentes que tendrà nuestra interfaz, como cuando hacemos click en un boton
import java.awt.event.*;

// implements ActionListener es para controlar los eventos del boton click
public class Formulario extends JFrame implements ActionListener{
//creacion de componente  
  JButton boton1; 
//Constructor
  public Formulario(){
//posicionar el boton
  setLayout(null); 
//creacion del boton
  boton1 = new JButton("Cerrar");
//coordenadas de la posicion del boton regidas por ancho y alto de pantalla y ancho y alto de boton.
  boton1.setBounds(300,250,100,30);
//que aparezca el boton
  add(boton1);
//creacion de funcionalidad
boton1.addActionListener(this); 
 }

//capturar el evento, guardarlo 
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      System.exit(0);
    }
  }

//Diseño de interfaz grafica
public static void main(String args[]){
//creacion de objeto
Formulario formulario1 = new Formulario();
formulario1.setBounds(0,0, 450, 350);
formulario1.setVisible(true);
formulario1.setResizable(false);
formulario1.setLocationRelativeTo(null);
}
}
