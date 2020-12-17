import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica11 extends JFrame implements ItemListener {

	private JComboBox Menu;

	public InterfazGrafica11(){
	
		setLayout(null);
		Menu = new JComboBox();
		Menu.setBounds(10,10,80,20);
		add(Menu);

		Menu.addItem("rojo");
		Menu.addItem("azul");
		Menu.addItem("verde");
		Menu.addItem("amarillo");
		Menu.addItem("negro");
		Menu.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e){
	
		if(e.getSource() == Menu){
			
			String Seleccion = Menu.getSelectedItem().toString();
			setTitle(Seleccion);
		}
	}

	public static void main (String args []){
	
		InterfazGrafica11 Formulario = new InterfazGrafica11();
		Formulario.setBounds(0,0,200,150);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
