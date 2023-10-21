import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  //barra del menu
  private JMenuBar menubar;
  //pestaña
  private JMenu menu1;
  //items de las pestañas 
  private JMenuItem menuitem1, menuitem2, menuitem3;

public Formulario(){
  setLayout(null);

//1ro, diseñar la barra.
  menubar = new JMenuBar();
  setJMenuBar(menubar);

//creacion de pestañas
  menu1 = new JMenu("Opciones");

//indicar que tiene que estar en la barra
  menubar.add(menu1);    

//introducir items de las pestañas
  menuitem1 = new JMenuItem("Rojo");
//creacion de evento
  menuitem1.addActionListener(this);
//indicicar que el item debe estar dentro de la pestaña
  menu1.add(menuitem1);


//introducir items de las pestañas
  menuitem2 = new JMenuItem("Verde");
//creacion de evento
  menuitem2.addActionListener(this);
//indicicar que el item debe estar dentro de la pestaña
  menu1.add(menuitem2);


//introducir items de las pestañas
  menuitem3 = new JMenuItem("Azul");
//creacion de evento
  menuitem3.addActionListener(this);
//indicicar que el item debe estar dentro de la pestaña
  menu1.add(menuitem3);
 }

//programando evento
public void actionPerformed(ActionEvent e){
  Container fondo = this.getContentPane();

  if(e.getSource() == menuitem1){
    fondo.setBackground(new Color(255,0,0));
  }
  if(e.getSource() == menuitem2){
    fondo.setBackground(new Color(0,255,0));
  }
  if(e.getSource() == menuitem3){
    fondo.setBackground(new Color(0,0,255));
  }
}

 public static void main (String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,300);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null);
 }
}
