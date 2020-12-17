/*Boton aceptar terminos y condiciones*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class InterfazGrafica16 extends JFrame implements ActionListener, ChangeListener{

	private JLabel texto;
	private JCheckBox aceptar;
	private JButton boton1;

	public InterfazGrafica16(){
	
		setLayout(null);
		texto = new JLabel("Aceptar terminos y condiciones");
		texto.setBounds(10,10,400,30);
		add(texto);

		aceptar = new JCheckBox("Acepto");
		aceptar.setBounds(10,50,100,30);
		aceptar.addChangeListener(this);
		add(aceptar);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

	
	}

	public void stateChanged(ChangeEvent e){
	
		if(aceptar.isSelected() == true){
			
			boton1.setEnabled(true);
		}else{
			boton1.setEnabled(false);
		}

	}

	public void actionPerformed(ActionEvent e){
	
		if(e.getSource() == boton1){
		
			System.exit(0); /*Cerrar Interfaz*/
		}
	}

	public static void main (String args[]){
	
		InterfazGrafica16 Formulario = new InterfazGrafica16();
		Formulario.setBounds(0,0,350,200);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
