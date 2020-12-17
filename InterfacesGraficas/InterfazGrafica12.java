import javax.swing.*;
import java.awt.*; /*Trabajar con colores, la libreria awt tiene dos tipos de componentes que nos ayudaran en este ejercicio*/
import java.awt.event.*;

public class InterfazGrafica12 extends JFrame implements ActionListener{

	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JComboBox lista1, lista2, lista3;
	private JButton boton1;

	public InterfazGrafica12(){
	
		setLayout(null);
		etiqueta1 = new JLabel("Rojo");
		etiqueta1.setBounds(10,10,100,10);
		add(etiqueta1);

		lista1 = new JComboBox();
		lista1.setBounds(120,10,50,30);
		for(int i = 0; i <= 255; i++){
		
			lista1.addItem(String.valueOf(i)); /*Hacer un parceo de número a texto*/
		}
		add(lista1);

		etiqueta2 = new JLabel("Verde");
		etiqueta2.setBounds(10,50,100,10);
		add(etiqueta2);

		lista2 = new JComboBox();
		lista2.setBounds(120,50,50,30);
		for(int i = 0; i <= 255; i++){
		
			lista2.addItem(String.valueOf(i));
                }
		add(lista2);


		etiqueta3 = new JLabel("Azul");
                etiqueta3.setBounds(10,90,100,10);
                add(etiqueta3);

                lista3 = new JComboBox();
                lista3.setBounds(120,90,50,30);
                for(int i = 0; i <= 255; i++){

                        lista3.addItem(String.valueOf(i));
                }
		add(lista3);

		boton1 = new JButton("Fijar color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e){
	
		if(e.getSource() == boton1){
		
			String cad1 = lista1.getSelectedItem().toString();
			String cad2 = lista2.getSelectedItem().toString();
			String cad3 = lista3.getSelectedItem().toString();

			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);

			Color color1 = new Color(rojo,verde,azul); /*Crear objetos de tipo color*/
			boton1.setBackground(color1);

		}
	}

	public static void main (String args []){
	
		InterfazGrafica12 Formulario = new InterfazGrafica12();
		Formulario.setBounds(0,0,190,220);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
