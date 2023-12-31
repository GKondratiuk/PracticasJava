import javax.swing.*;
import java.awt.event.*;

//CREACION DE CLASE
public class Formulario extends JFrame implements ActionListener{

//CREACION DE COMPONENTES
  private JTextField textfield1; //caja de texto
  private JLabel label1; //etiqueta
  private JButton boton1; //boton

//CREACION DE DISEÑO
  public Formulario(){
  setLayout(null); 
  label1 = new JLabel("Usuario");
  label1.setBounds(10,10,100,30);
  add(label1);

  textfield1 = new JTextField();
  textfield1.setBounds(120,17,150,20);
  add(textfield1);
  
  boton1 = new JButton("Aceptar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }  

  //PROGRAMANDO CAPTURA DE EVENTO DE BOTON
  public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    String texto = textfield1.getText(); //obtener texto que el usuario coloque
    setTitle(texto);
  }  
 }
 
  public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,300,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);

  }
}
