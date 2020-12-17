import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica9 extends JFrame implements ActionListener{

	private JTextField Texto_uno;
	private JScrollPane Barra;
	private JTextArea Texto_dos;
	private JButton Boton1;

	String Texto = ""; /*Variable donde almacenar el texto*/

	public InterfazGrafica9(){
	
		setLayout(null);
		Texto_uno = new JTextField();
		Texto_uno.setBounds(10,10,200,30);
		add(Texto_uno);

		Boton1 = new JButton("Agregar");
		Boton1.setBounds(250,10,100,30);
		add(Boton1);
		Boton1.addActionListener(this);

		Texto_dos = new JTextArea();
		Barra = new JScrollPane(Texto_dos);
		Barra.setBounds(10,50,400,300);
		add(Barra);
	}	

	public void actionPerformed(ActionEvent e){ /*Programación de la acción del botón*/
	
		if(e.getSource() == Boton1){
		
			Texto += Texto_uno.getText() + "\n"; /*Espacio en memoria donde trabaja el texo, funciona como una acumulador*/
			Texto_dos.setText(Texto); /*Agrega el  texto*/
			Texto_uno.setText(""); /*Limpia el primer cuadro*/

			
		}

	}

	public static void main (String args[]){
	
		InterfazGrafica9 Formulario = new InterfazGrafica9();
		Formulario.setBounds(0,0,540,400);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
