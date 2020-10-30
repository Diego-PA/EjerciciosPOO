/**
*@author Ximena Rojas
*@version 1.0
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IGULectura extends JFrame{
	
	private JTextField sNombre;
	private JTextField sApellido;

	public IGULectura(){

		super("Inicio");
		//setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		add(new JLabel("Dame tu nombre: "));
		sNombre = new JTextField(10);
		add(sNombre);
		/*add(new JLabel("Dame tu apellido: "));
		sApellido = new JTextField(10);
		add(sApellido);
		*/
		JButton btContinuar = new JButton("Continuar");
		btContinuar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				JOptionPane.showMessageDialog(IGULectura.this, 
					"Hola" + sNombre.getText(), 
					"Saludo", JOptionPane.PLAIN_MESSAGE);
				System.out.println("Acciones del botón.");

			}

		});

		add(btContinuar);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(400, 400);
		setLocation(600, 200);
		setVisible(true);

	}

	public static void main(String[] args){

		IGULectura olgu = new IGULectura();

	}

}