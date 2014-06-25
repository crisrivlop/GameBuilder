package kernel.gui;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SimpleGraphic extends GameGraphic{
	private BufferedImage _sprite;
	
	public SimpleGraphic(Rectangle prectangle, int pvelocity,String ppath, boolean psolid) throws IOException {
		// TODO Auto-generated constructor stub
		_sprite = ImageIO.read(new File(ppath));
		init(prectangle, pvelocity, false, psolid, createId());
	}
	
	public SimpleGraphic(int px, int py, int pheight,int pwidth, int pvelocity,String ppath, boolean psolid) throws IOException {
		// TODO Auto-generated constructor stub
		_sprite = ImageIO.read(new File(ppath));
		init(px, py, pheight, pwidth, pvelocity, false, psolid, createId());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//creo que es con el pack logic
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		g.drawImage(_sprite, getX(), getY(), null);
	}
	
	
}
