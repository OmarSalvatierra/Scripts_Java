import javax.swing.*;
import java.awt.event.*;

	public class InterfazGrafica4 extends JFrame implements ActionListener {
	
		JButton Boton1;
		public InterfazGrafica4(){
		
		/*Diseño del botón*/
			setLayout(null);
			Boton1 = new JButton("Cerrar");
			Boton1.setBounds(300,250,100,30);
			add(Boton1); /*Super importante*/
			Boton1.addActionListener(this);

		}

		/*Funcionalidad del botón*/
			public void actionPerformed(ActionEvent e){ /*e es el espacio en memoria*/
				if(e.getSource() == Boton1){
				
					System.exit(0);
				}
			}

			public static void main(String args[]){
			
				InterfazGrafica4 Formulario = new InterfazGrafica4();
				Formulario.setBounds(0,0,450,350);
				Formulario.setVisible(true);
				Formulario.setResizable(false);
				Formulario.setLocationRelativeTo(null);
			}
	}
