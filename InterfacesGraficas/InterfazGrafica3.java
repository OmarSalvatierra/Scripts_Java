import javax.swing.*;

	public class InterfazGrafica3 extends JFrame{
	
		private JLabel etiqueta1;
		private JLabel etiqueta2;

		public InterfazGrafica3(){
		
			setLayout(null);
			etiqueta1 = new JLabel("Interfaz Gráfica");
			etiqueta1.setBounds(10,20,300,30);
			add(etiqueta1);

			etiqueta2 =new JLabel("Versión 1.0");
			etiqueta2.setBounds(10,100,100,30);
			add(etiqueta2);
		}

		public static void main(String args[]){
		
			InterfazGrafica3 Formulario = new InterfazGrafica3();
			Formulario.setBounds(0,0,300,200);
			Formulario.setResizable(false);
			Formulario.setVisible(true);
			Formulario.setLocationRelativeTo(null);
		}
	}
