package kernel.gui;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import list.DoubleCircularList;
import list.DoubleList;
import list.Iterator;

public class Animation extends GameGraphic{
	private DoubleCircularList<BufferedImage> _imageSecuences;
	private Iterator<BufferedImage> _iter;
	
	public Animation(Rectangle prectangle, DoubleList<String> ppaths,boolean psolid) throws IOException {
		// TODO Auto-generated constructor stub
		_imageSecuences = new DoubleCircularList<>();
		for (int x= 0; x<ppaths.getLenght();x++)_imageSecuences.add(ImageIO.read(new File(ppaths.get(x))));
		init(prectangle, 0, false, psolid, createId());
		_iter = _imageSecuences.getIterator();
		System.out.println("Init: Terminate");
	}
	
	public Animation(int px, int py, int pheight, int pwidth, DoubleList<String> ppaths, boolean psolid) throws IOException{
		_imageSecuences = new DoubleCircularList<>();
		for (int x= 0; x<ppaths.getLenght();x++)_imageSecuences.add(ImageIO.read(new File(ppaths.get(x))));
		init(px,py, pheight, pwidth, 0, false, psolid, createId());
		_iter = _imageSecuences.getIterator();
	}
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		_iter.getNext();
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		g.drawImage(_iter.actual(),getX(), getY(), null);
	}
	
}
