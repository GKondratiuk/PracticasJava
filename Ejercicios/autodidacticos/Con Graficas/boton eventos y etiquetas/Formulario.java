import javax.swing.*; //diseño de interfaz
import java.awt.event.*; //eventos

//creacion de clase
public class Formulario extends JFrame implements ActionListener{

//Creacion de componentes
//privado porque solo nuestra clase formulario va a tener acceso a los botones  
  private JButton boton1, boton2, boton3;
  private JLabel label1; 

//diseño de componentes - Constructor
  public Formulario(){
  setLayout(null);

  boton1 = new JButton("1"); // crea el boton y el texto dentro del mismo
  boton1.setBounds(10,100,90,30); //asigna coordenadas
  add(boton1); //lo agrega dentro de la interfaz grafica 
  boton1.addActionListener(this); //se le asigna funcionalidad con el click

  boton2 = new JButton("2"); 
  boton2.setBounds(110,100,90,30);
  add(boton2);
  boton2.addActionListener(this);

  boton3 = new JButton("3");
  boton3.setBounds(210,100,90,30);
  add(boton3);
  boton3.addActionListener(this);

  label1 = new JLabel("En espera...");
  label1.setBounds(10,10,300,30);
  add(label1); 
 }

//creacion de la captura de los eventos
public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
  label1.setText("Has presionado el boton 1");
  }   
  if(e.getSource() == boton2){
  label1.setText("Has presionado el boton 2");
  } 
  if(e.getSource() == boton3){
  label1.setText("Has presionado el boton 3");
  } 
 }
//arrancador
  public static void main (String args []){
//objeto
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,350,200);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}
