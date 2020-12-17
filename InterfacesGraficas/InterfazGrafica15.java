import javax.swing.*;
import javax.swing.event.*;

public class InterfazGrafica15 extends JFrame implements ChangeListener{

	private JCheckBox casilla1, casilla2, casilla3;
	
	public InterfazGrafica15(){
	
		setLayout(null);
		casilla1 = new JCheckBox("Inglés");
		casilla1.setBounds(10,10,150,30);
		casilla1.addChangeListener(this);
		add(casilla1);

		casilla2 = new JCheckBox("Aleman");
		casilla2.setBounds(10,50,150,30);
		casilla2.addChangeListener(this);
                add(casilla2);

		casilla3 = new JCheckBox("Francés");
		casilla3.setBounds(10,90,150,30);
		casilla3.addChangeListener(this);
                add(casilla3);

	}

	public void stateChanged(ChangeEvent e){
	
		String texto = "";

		if(casilla1.isSelected() == true){
		
			texto = texto + "Inglés-";
		}
		if(casilla2.isSelected() == true){
		
			texto = texto + "Aleman-";
		}
		if(casilla3.isSelected() == true){
		
			texto = texto + "Francés-";
		}
		setTitle(texto);
	}

	public static void main (String args[]){
	
		InterfazGrafica15 Formulario = new InterfazGrafica15();
		Formulario.setBounds(0,0,350,200);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
