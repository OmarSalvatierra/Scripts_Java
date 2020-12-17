import javax.swing.*;

public class InterfazGrafica2 extends JFrame{

	public InterfazGrafica2(){
	
		setLayout(null);
	}

	public static void main(String args[]){
	
		InterfazGrafica2 Formulario = new InterfazGrafica2();
		Formulario.setBounds(0,0,400,550);
		Formulario.setVisible(true);
		Formulario.setLocationRelativeTo(null);
		Formulario.setResizable(false);


	}
} 
