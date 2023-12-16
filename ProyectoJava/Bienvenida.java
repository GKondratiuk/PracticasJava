import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//clase 
public class Bienvenida extends JFrame implements ActionListener{
//componentes
 private JTextField textfield1; //casilla de texto
 private JLabel label1, label2, label3, label4;
 private JButton boton1;
/*
public porque pueden venir otras clases ( en este caso "terminos  condiciones" y hacer uso de las mismas).
static porque indica un atributo de clase, caracteristica propia 
acá vamos a guardar un nombre del usuario y cualquier interfaz va a poder utilizar su contenido 
*/
 public static String texto = "";

//constructor
public Bienvenida(){
 setLayout(null); //hay que ponerlo
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setTitle("Bienvenido"); //titulo del programa que figuara en la barra
 getContentPane().setBackground(new Color (255,0,0)); //colocar el color de la intefaz
 //obtener imagen, cargar imagen, colocar imagen en el icono de la interfaz gráfica
 setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
 
//crear objeto llamado "imagen" para agregar a  la label
 ImageIcon imagen = new ImageIcon("images/logo-coca.png");
 label1 = new JLabel(imagen); //la label será el logo de cocacola
 label1.setBounds(25,15,300,150);
 add(label1);

 label2 = new JLabel("Sistema de Control Vacacional");
 label2.setBounds(35,135,400,30);
 label2.setFont(new Font("Arial", 3, 18)); //fuente, tipo y tamaño
 label2.setForeground(new Color(255,255,255)); //color del texto
 add(label2); 
 
 label3 = new JLabel("Ingrese su nombre");
 label3.setBounds(45,212,200,30);
 label3.setFont(new Font("Arial", 1, 12)); //fuente, tipo y tamaño
 label3.setForeground(new Color(255,255,255)); //color del texto
 add(label3);

 label4 = new JLabel("2023 The Coca-Cola Company");
 label4.setBounds(85,375,300,30);
 label4.setFont(new Font("Arial", 1, 12)); //fuente, tipo y tamaño
 label4.setForeground(new Color(255,255,255)); //color del texto
 add(label4);
 
 textfield1 = new JTextField ();
 textfield1.setBounds(45,240,255,25);
 textfield1.setBackground(new Color(224,224,224)); //color de la cajita de texto
 textfield1.setFont(new Font("Arial", 1, 14)); //fuente, tipo y tamaño
 textfield1.setForeground(new Color(255,0,0)); //color del texto
 add(textfield1);

 boton1 = new JButton("Ingresar");
 boton1.setBounds(125,280,100,30);
 boton1.setBackground(new Color(255,255,255));
 boton1.setFont(new Font("Arial", 1, 14));
 boton1.setForeground(new Color(255,0,0)); //color de la letra
 boton1.addActionListener(this); //se le va a agregar un evento 
 add(boton1);
 } //final del constructor

//creando funcionalidad para el boton1
public void actionPerformed(ActionEvent e){
 if(e.getSource() == boton1){
//trim borra los espacios y lo guarda dentro de nuestra variable
  texto = textfield1.getText().trim();
//ecuals verifica el texto y si compara que està vacìa, va a mandar un msj
  if(texto.equals("")){
  JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
  } else {
//si hay texto entonces ejecutaremos la interfaz de terminos y condiciones, para esto copiamos y pegamos las caracteristicas del metodo main del archivo licencia.java
 Licencia ventanalicencia = new Licencia();
 ventanalicencia.setBounds(0,0,600,360);
//quiero que se vea la interfaz de licencia
 ventanalicencia.setVisible(true);
 ventanalicencia.setResizable(false);
 ventanalicencia.setLocationRelativeTo(null);
 //no quiero que se vea la interfaz de bienvenida
 this.setVisible(false);
  } 
 }
} 

//Metodo main para darle dimensiones y coordenadas a nuestra interfaz
public static void main(String args[]){
 Bienvenida ventanabienvenida = new Bienvenida();
 ventanabienvenida.setBounds(0,0,400,450);
 ventanabienvenida.setVisible(true);
 ventanabienvenida.setResizable(false);
 ventanabienvenida.setLocationRelativeTo(null);
 }
}


