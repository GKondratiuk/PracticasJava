import javax.swing.*;

//CREACION DE CLASE
public class Formulario extends JFrame{
//INICIALIZADOR DE COMPONENTES
  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;

//CONSTRUCTOR - DAR DISEÑOS A LOS COMPONENTES
  public Formulario(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1); //colocamos el nombre del       componente para que esten vinculados uno con el otro
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);
 }
//METODO MAIN - DAMOS DISEÑO A LA INTERFAZ
  public static void main (String args []){
//CREAMOS OBJETO
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,540,400);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);

  }


}
