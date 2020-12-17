import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazGrafica14 extends JFrame implements ActionListener{

	private JMenuBar menubar;
	private JMenu menu1, submenu1, submenu2;
	private JMenuItem opc1, opc2, opc3, opc4;

	public InterfazGrafica14(){
	
		setLayout(null);
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu1 = new JMenu("Opciones");
		menubar.add(menu1);

		submenu1 = new JMenu("Tamaño de la ventana");
		menu1.add(submenu1);

		submenu2 = new JMenu("Color de fondo");
		menu1.add(submenu2);

		opc1 = new JMenuItem("300*200");
		submenu1.add(opc1);
		opc1.addActionListener(this);

		opc2 = new JMenuItem("640*480");
                submenu1.add(opc2);
		opc2.addActionListener(this);

		opc3 = new JMenuItem("Rojo");
                submenu2.add(opc3);
		opc3.addActionListener(this);

                opc4 = new JMenuItem("Verde");
                submenu2.add(opc4);
		opc4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
	
		/*Cambiar el formo directamente de la interfaz gráfica*/
		if(e.getSource() == opc1){
		
			setSize(300,200);
		}
		if(e.getSource() == opc2){
		
			setSize(640,480);
		}
		if(e.getSource() == opc3){
		
			getContentPane().setBackground(new Color(255,0,0));
		}
                if(e.getSource() == opc4){
		
			getContentPane().setBackground(new Color(0,255,0));
		}
	}

	public static void main (String args[]){
	
		InterfazGrafica14 Formulario = new InterfazGrafica14();
		Formulario.setBounds(0,0,300,200);
		Formulario.setVisible(true);
		Formulario.setResizable(false);
		Formulario.setLocationRelativeTo(null);
	}
}
