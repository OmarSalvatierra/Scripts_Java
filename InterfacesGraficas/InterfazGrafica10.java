import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica10 extends JFrame implements ActionListener{

	private JTextField dato_uno, dato_dos;
       	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JButton boton1;

	public InterfazGrafica10(){
	
		setLayout(null);
		etiqueta1 = new JLabel("Valor 1");
		etiqueta1.setBounds(50,5,100,30);
		add(etiqueta1);

		etiqueta2 = new JLabel("Valor 2");
		etiqueta2.setBounds(50,35,100,30);
		add(etiqueta2);

		etiqueta3 = new JLabel("Resultado:");
		etiqueta3.setBounds(120,80,100,30);
		add(etiqueta3);

		dato_uno = new JTextField();
		dato_uno.setBounds(120,10,150,20);
		add(dato_uno);

		dato_dos = new JTextField();
		dato_dos.setBounds(120,40,150,20);
		add(dato_dos);

		boton1 = new JButton("Sumar");
		boton1.setBounds(10,80,100,30);
		add(boton1);
		boton1.addActionListener(this);

	}	
	
	public void actionPerformed(ActionEvent e){
	
		if(e.getSource() == boton1){ /* == compara,  = asigna*/
		
			int valor_uno = 0, valor_dos = 0, resultado = 0;

			valor_uno = Integer.parseInt(dato_uno.getText()); /*Convierte texto a int*/
			valor_dos = Integer.parseInt(dato_dos.getText());

			resultado = valor_uno + valor_dos;

			etiqueta3.setText("Resultado: " + resultado);

		}
	} 

	public static void main (String args[]){
	
		InterfazGrafica10 Formulario = new InterfazGrafica10();
		Formulario.setBounds(0,0,300,150);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}

}
