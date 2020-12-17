import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazGrafica13 extends JFrame implements ActionListener{

	private JMenuBar menubarra;
	private JMenu menu1;
	private JMenuItem opcion1, opcion2, opcion3;

	public InterfazGrafica13(){
	
		setLayout(null);
		menubarra = new JMenuBar();
		setJMenuBar(menubarra);

		menu1 = new JMenu("Opciones");
		menubarra.add(menu1);

		opcion1 = new JMenuItem("Rojo");
		opcion1.addActionListener(this);
		menu1.add(opcion1);

		opcion2 = new JMenuItem("Verde");
                opcion2.addActionListener(this);
                menu1.add(opcion2);

		opcion3 = new JMenuItem("Azul");
                opcion3.addActionListener(this);
                menu1.add(opcion3);
		
	}

	public void actionPerformed(ActionEvent e){
	
		Container fondo = this.getContentPane(); /*Hacer referencia a la interfaz grafica con la que estamos trabajando*/
		
		if(e.getSource() == opcion1 ){
		
			fondo.setBackground(new Color(225,0,0));

		}
		if(e.getSource() == opcion2 ){
		
			fondo.setBackground(new Color(0,225,0));
		}
		if(e.getSource() == opcion3 ){
		
			fondo.setBackground(new Color(0,0,255));
		}

	}

	public static void main (String args []){
	
		InterfazGrafica13 Formulario = new InterfazGrafica13();
		Formulario.setBounds(0,0,400,300);
		Formulario.setVisible(true);
		Formulario.setLocationRelativeTo(null);
	}
}
