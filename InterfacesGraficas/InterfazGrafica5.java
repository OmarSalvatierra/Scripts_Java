import javax.swing.*; /*Diseño interfaz grafica*/
import java.awt.event.*; /*Acciones de los componentes*/

public class InterfazGrafica5 extends JFrame implements ActionListener{

	private JButton Boton1, Boton2, Boton3; /*Declaramos 3 botones privado(ninguna otra clase tendra acceso a nuestros botones)*/
	private JLabel Etiqueta; /*Declaramos una etiqueta de control de texto dinamico*/

	public InterfazGrafica5(){
		/*Diseño botones*/
	
		setLayout(null);
		Boton1 = new JButton("Botón 1");
		Boton1.setBounds(10,100,90,30);
		add(Boton1);
		Boton1.addActionListener(this);

		Boton2 = new JButton("Botón 2");
		Boton2.setBounds(110,100,90,30);
		add(Boton2);
		Boton2.addActionListener(this);

		Boton3 = new JButton("Botón 3");
                Boton3.setBounds(210,100,90,30);
                add(Boton3);
                Boton3.addActionListener(this);

		Etiqueta = new JLabel("En espera ...");
		Etiqueta.setBounds(10,10,300,30);
		add(Etiqueta);

	}

	public void actionPerformed(ActionEvent e){
	
		if(e.getSource() == Boton1){
		
			Etiqueta.setText("Has presionado el Botón 1"); /*Colocar texo en una etiqueta*/
		}

		if(e.getSource() == Boton2){
		
			Etiqueta.setText("Has presionado el Botón 2");
		}

		if(e.getSource() == Boton3){

                        Etiqueta.setText("Has presionado el Botón 3");
                }

	}

	public static void main(String args[]){

		InterfazGrafica5 Formulario = new InterfazGrafica5();
		Formulario.setBounds(0,0,350,200);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);

	

	}
}
