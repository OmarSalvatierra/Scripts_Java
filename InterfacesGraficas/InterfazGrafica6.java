import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica6 extends JFrame implements ActionListener{

	private JTextField Texto;
	private JLabel Etiqueta;
	private JButton Boton1;

	public InterfazGrafica6(){
	
		setLayout(null);
		Etiqueta = new JLabel("Usuario: ");
		Etiqueta.setBounds(10,10,100,30);
		add(Etiqueta);

		Texto = new JTextField();
		Texto.setBounds(120,16,150,20);
		add(Texto);

		Boton1 = new JButton("Aceptar");
		Boton1.setBounds(10,80,100,30);
		add(Boton1);
		Boton1.addActionListener(this);
			
	}

	public void actionPerformed(ActionEvent e){
	
		if(e.getSource() == Boton1){
		
			String entrada = Texto.getText();
			setTitle(entrada);
		}
	}

	public static void main (String args[]){
	
		InterfazGrafica6 Formulario = new InterfazGrafica6();
		Formulario.setBounds(0,0,300,150);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
