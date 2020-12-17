import javax.swing.*;

public class InterfazGrafica8 extends JFrame{

	private JTextField Texto_uno;
	private JScrollPane Barra;
	private JTextArea Texto_dos;

	public InterfazGrafica8(){
	
		setLayout(null);
		Texto_uno = new JTextField();
		Texto_uno.setBounds(10,10,200,30);
		add(Texto_uno);

		Texto_dos = new JTextArea();
		Barra = new JScrollPane(Texto_dos); /*Colocamos el cuadro de texto dentro de la barra*/
		Barra.setBounds(10,50,400,300);
		add(Barra); /*El diseño es de la barra el cuadro de texto es parte de la barra*/

	}

	public static void main (String args[]){
	
		InterfazGrafica8 Formulario = new InterfazGrafica8();
		Formulario.setBounds(0,0,540,400);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);	
	}
}
