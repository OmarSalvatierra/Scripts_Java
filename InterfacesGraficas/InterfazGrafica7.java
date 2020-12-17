import javax.swing.*;

public class InterfazGrafica7 extends JFrame{

	private JTextField Texto_uno;
	private JTextArea Texto_dos;

	public InterfazGrafica7(){
	
		setLayout(null);
		Texto_uno = new JTextField();
		Texto_uno.setBounds(10,10,200,30);
		add(Texto_uno);

		Texto_dos = new JTextArea();
		Texto_dos.setBounds(10,50,400,300);
		add(Texto_dos);

	}

	public static void main (String args[]){
	
		InterfazGrafica7 Formulario = new InterfazGrafica7();
		Formulario.setBounds(0,0,540,400);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}

}
