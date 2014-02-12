package guipack.mapperpack;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;

public class Descriptor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Descriptor() {
		setBackground(new Color(210, 105, 30));
		setLayout(null);
		
		JLabel ancho = new JLabel("Ancho:");
		ancho.setForeground(SystemColor.text);
		ancho.setBounds(10, 30, 60, 15);
		add(ancho);
		
		JLabel largo = new JLabel("Largo:");
		largo.setForeground(SystemColor.text);
		largo.setBounds(10, 50, 60, 15);
		add(largo);
		
		JLabel descripcion = new JLabel("Descripción:");
		descripcion.setForeground(SystemColor.text);
		descripcion.setBounds(10, 70, 92, 15);
		add(descripcion);

	}
}
