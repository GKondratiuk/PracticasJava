import javax.swing.*;
//CLASE
public class Formulario extends JFrame{
//DECLARACION  
  private JTextField textfield1;
  private JTextArea textarea1;
//CONSTRUCTOR
  public Formulario(){
  setLayout(null);
  
  textfield1 = new JTextField("Nombre");
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea("Comentarios...");
  textarea1.setBounds(10,50,400,300);
  add(textarea1);
 }

//METODO MAIN - DISEÑO DE INTERFAZ GRAFICA
public static void main (String args []){
//CREAR OBJETO  
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,540,400);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}
