package guipack.mapperpack;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class MapEditor extends JPanel{

	private static final long serialVersionUID = 1L;
	private int ancho = 1024;
	private int alto = 800;
	private JToolBar toolBar = new JToolBar();
	private Gallery galeria = new Gallery();
	private JPanel panel = new JPanel();
	private JMenuBar menuBar = new JMenuBar();
	private JScrollPane scrollWorkspace = new JScrollPane();
	private Workspace workspace = new Workspace();
	private JTabbedPane Galeria = new JTabbedPane(JTabbedPane.TOP);
	private JTabbedPane MenuTabular = new JTabbedPane(JTabbedPane.TOP);
	
	
	public MapEditor() {
		setBorder(null);
		setLayout(null);
		setBounds(10, 10, ancho, alto);
		setBackground(Color.DARK_GRAY);
		setMinimumSize(new Dimension(800, 350));
		
		
		panel.setBounds(0, 0, 1024, 36);
		add(panel);
		panel.setLayout(null);
		
		
		menuBar.setBounds(0, 0, 1024, 36);
		panel.add(menuBar);
		menuBar.setMargin(new Insets(0, 0, -2, 0));
		menuBar.setBorderPainted(false);
		
		JMenu Archivo = new JMenu("Archivo");
		Archivo.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Archivo);
		
		JMenuItem Abrir = new JMenuItem("Abrir");
		Abrir.setBackground(UIManager.getColor("windowBorder"));
		Archivo.add(Abrir);
		
		JMenuItem Guardar = new JMenuItem("Guardar");
		Archivo.add(Guardar);
		
		JMenuItem GuardarComo = new JMenuItem("Guardar como");
		Archivo.add(GuardarComo);
		
		JMenuItem Cerrar = new JMenuItem("Cerrar");
		Archivo.add(Cerrar);
		
		JMenu Editar = new JMenu("Editar");
		menuBar.add(Editar);
		
		MenuTabular.setBounds(0, 328, 290, 469);
		add(MenuTabular);
		
		
		JScrollPane scrollHerramientas = new JScrollPane();
		JScrollPane scrollDescriptor = new JScrollPane();
		
		scrollHerramientas.setViewportBorder(null);
		MenuTabular.addTab("Herramientas", null, scrollHerramientas, null);
		
		Tools herramientas = new Tools();
		scrollHerramientas.setViewportView(herramientas);

		
		scrollDescriptor.setViewportBorder(null);
		MenuTabular.addTab("Descripcion", null, scrollDescriptor, null);
		
		JScrollPane scrollOption = new JScrollPane();
		scrollOption.setViewportBorder(null);
		MenuTabular.addTab("Opciones", null, scrollOption, null);


		Descriptor descriptor = new Descriptor();
		scrollDescriptor.setViewportView(descriptor);

		Option opcion = new Option();
		scrollOption.setViewportView(opcion);

		scrollWorkspace.setBounds(300, 64, ancho-310, 724);
		add(scrollWorkspace);
		
		scrollWorkspace.setViewportView(workspace);
		
		Galeria.setBounds(0, 36, 290, 280);
		add(Galeria);
		Galeria.addTab("Galeria", null, galeria, null);
		

		toolBar.setFloatable(false);
		toolBar.setBounds(300, 36, 680, 26);
		add(toolBar);
	}
	
	public void redimensionarEditor(){
		toolBar.setSize(ancho-310, 30);
		scrollWorkspace.setSize(ancho-310, alto-100);
		workspace.setSize(ancho-310, alto-100);
		panel.setSize(ancho, 36);
		menuBar.setSize(ancho, 36);
		MenuTabular.setSize(MenuTabular.getWidth(), alto-363);
	}
	
	
	public void setAncho(int pancho){
		ancho=pancho;
	}
	public void setAlto(int palto){
		alto = palto;
	}
}
