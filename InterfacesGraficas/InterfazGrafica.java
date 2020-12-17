import javax.swing.*; /*El asterisco indica que vamos a ocupar todos los elementos de la libreria swing*/	
	public class InterfazGrafica extends JFrame { /*Importar una clase para crear interfaces gráficas */
			private JLabel label1;
				
				public InterfazGrafica(){
				setLayout(null);
				label1 = new JLabel("Gabo.shop");
				label1.setBounds(10,20,200,300);
				add(label1);	
		}
	
		public static void main(String args[]){

			InterfazGrafica Formulario = new InterfazGrafica();
			Formulario.setBounds(0,0,400,300);
			Formulario.setVisible(true);
			Formulario.setLocationRelativeTo(null);	
		}
}
