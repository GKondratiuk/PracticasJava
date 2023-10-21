import javax.swing.*;
import javax.swing.event.*;
//changelistener nos da la posibilidad de darle eventos a los checkbox
public class Formulario extends JFrame implements ChangeListener{

 private JCheckBox check1, check2, check3;

 public Formulario(){
  setLayout(null);
  check1 = new JCheckBox("Inglés");
  check1.setBounds(10,10,150,30);
//asignamos evento
  check1.addChangeListener(this);
  add(check1);
 
  check2 = new JCheckBox("Francés");
  check2.setBounds(10,50,150,30);
//asignamos evento
  check2.addChangeListener(this);
  add(check2);

  check3 = new JCheckBox("Alemán");
  check3.setBounds(10,90,150,30);
//asignamos evento
  check3.addChangeListener(this);
  add(check3);
 }
//captura de evento
 public void stateChanged(ChangeEvent e){
  String cad="";

  if(check1.isSelected() == true){
    cad = cad + "Inglés-";
  }
  if(check2.isSelected() == true){
    cad = cad + "Francés-";  
  }
  if(check3.isSelected() == true){
    cad = cad + "Aleman-";  
  }
//muestra del titulo de la cadena de texto
  setTitle(cad); 
}

public static void main (String args[]){
 Formulario formulario1 = new Formulario();
 formulario1.setBounds(0,0,350,200);
 formulario1.setVisible(true);
 formulario1.setResizable(false);
 formulario1.setLocationRelativeTo(null);
 }
}
