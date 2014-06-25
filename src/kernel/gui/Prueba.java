package kernel.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import list.DoubleList;

public class Prueba extends JFrame implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Animation anim;

	public Prueba() {
		DoubleList<String> list = new DoubleList<>();
		list.add("/home/familia/Escritorio/final/error00000.png");
		list.add("/home/familia/Escritorio/final/error00001.png");
		list.add("/home/familia/Escritorio/final/error00002.png");
		list.add("/home/familia/Escritorio/final/error00003.png");
		list.add("/home/familia/Escritorio/final/error00004.png");
		list.add("/home/familia/Escritorio/final/error00005.png");
		list.add("/home/familia/Escritorio/final/error00006.png");
		list.add("/home/familia/Escritorio/final/error00007.png");
		list.add("/home/familia/Escritorio/final/error00008.png");
		list.add("/home/familia/Escritorio/final/error00009.png");
		list.add("/home/familia/Escritorio/final/error00010.png");
		list.add("/home/familia/Escritorio/final/error00011.png");
		list.add("/home/familia/Escritorio/final/error00012.png");
		list.add("/home/familia/Escritorio/final/error00013.png");
		list.add("/home/familia/Escritorio/final/error00014.png");
		list.add("/home/familia/Escritorio/final/error00015.png");
		list.add("/home/familia/Escritorio/final/error00016.png");
		list.add("/home/familia/Escritorio/final/error00017.png");
		try {
			anim = new Animation(new Rectangle(0, 0, 720, 480), list, false);
			System.out.println("Terminate");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIgnoreRepaint(true);
	}
	
	@Override
	public void paint(Graphics g) {
		BufferedImage a = new BufferedImage(720, 480, BufferedImage.TYPE_INT_ARGB);
		GameGraphic.g = a.getGraphics();
		anim.update();
		anim.render();
		g.drawImage(a, 0, 0, null);
		g.setColor(Color.orange);
		g.fillRect(0, 0, 100, 100);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.dispose();
	}
	
	@Override
	public void repaint() {
		paint(getGraphics());
	}
	
	public static void main(String[] args) {
		File f= new File("/home/familia/Escritorio/final/error00000.png");
		System.out.println(f.exists());
		try {
			BufferedImage bf = ImageIO.read(f);
			System.out.println("se cargo la imagen");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se cargo la imagen");
		}
		
		Prueba p = new Prueba();
		p.setVisible(true);
		p.setBounds(0, 0, 720, 480);
		Thread t = new Thread(p);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)repaint();
	}
}
