import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{

 private JComboBox combo1;
 
 public Formulario(){
  setLayout(null);
  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);
//agregar texto al menú deslplegale
  combo1.addItem("rojo");
  combo1.addItem("verde");
  combo1.addItem("azul");
  combo1.addItem("amarillo");
  combo1.addItem("negro");
//indicamos que mas adelante se va a encontrar con un evento programado
  combo1.addItemListener(this);
 }
//cada vez que haya una seleccion diferente dentro del componente, vamos a guardar el evento para este componente en el titulo del sistema
public void itemStateChanged(ItemEvent e){
 if(e.getSource() == combo1){
  String seleccion = combo1.getSelectedItem().toString();
  setTitle(seleccion);    
  }
 }

 public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,200,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  }

}
