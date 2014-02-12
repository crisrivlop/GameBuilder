package guipack.mapperpack;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class Gallery extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel listaObjetos;

	/**
	 * Create the panel.
	 */
	public Gallery() {
		listaObjetos = new JPanel();
		listaObjetos.setBackground(new Color(128, 0, 0));
		listaObjetos.setLayout(null);
		setLayout(null);
		setSize(290, 246);
		
		JToolBar toolbarGallery = new JToolBar();
		toolbarGallery.setFloatable(false);
		toolbarGallery.setBounds(0, 201, 285, 40);
		add(toolbarGallery);
		toolbarGallery.add(Box.createHorizontalGlue());
		JButton plusbtn = new JButton("");
		plusbtn.setIcon(new ImageIcon(Gallery.class.getResource("/guipack/imagepack/plus.png")));
		toolbarGallery.add(plusbtn);
		JButton minumbtn = new JButton("");
		minumbtn.setIcon(new ImageIcon(Gallery.class.getResource("/guipack/imagepack/minum.png")));
		toolbarGallery.add(minumbtn);
		
		JScrollPane scrollGalery = new JScrollPane();
		scrollGalery.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollGalery.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollGalery.setViewportBorder(null);
		scrollGalery.setViewportView(listaObjetos);
		scrollGalery.getViewport().setView(listaObjetos);
		
		scrollGalery.setBounds(0,0,282,200);
		listaObjetos.setSize(290,500);
		listaObjetos.setPreferredSize(listaObjetos.getPreferredSize());
		add(scrollGalery);

	}
}
