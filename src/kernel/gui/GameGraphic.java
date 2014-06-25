package kernel.gui;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameGraphic implements Renderizable{
	protected static Graphics g;
	private Rectangle _rectangle;
	private int _velocity;
	private String _id;
	private boolean _isSolid;
	private boolean _isEnemy;
	private static int _counter = 0;
	//private Entity _entity;
	
	public void setX(int px){
		_rectangle.x = px;
	}
	
	public int getX(){
		return _rectangle.x;
	}
	
	public void setY(int py){
		_rectangle.y = py;
	}
	
	public int getY(){
		return _rectangle.y;
	}
	
	public void setHeight(int pheight){
		_rectangle.height = pheight;
	}
	public int getHeight(){
		return _rectangle.height;
	}
	public void setWidth(int pwidth){
		_rectangle.width = pwidth;
	}
	public int getWidth(){
		return _rectangle.width;
	}
	public void setBounds(int px, int py, int pheight, int pwidth){
		_rectangle.setBounds(px, py, pwidth, pheight);
	}
	public Rectangle getRectangle(){
		return _rectangle;
	}
	public boolean collideWith(GameGraphic pgameGraphic){
		return pgameGraphic.getRectangle().intersects(_rectangle);
	}
	public void moveToLeft(){
		_rectangle.x -= _velocity;
	}
	public void moveToRight(){
		_rectangle.x += _velocity;
	}
	public void moveToUp(){
		_rectangle.y -= _velocity;
	}
	public void moveToDown(){
		_rectangle.y += _velocity;
	}
	public String getId(){
		return _id;
	}
	public boolean isSolid(){
		return _isSolid;
	}
	public boolean isEnemy(){
		return _isEnemy;
	}
	public int getVelocity(){
		return _velocity;
	}
	protected void init(int px, int py, int pheight, int pwidth, int pvelocity, boolean penemy, boolean psolid,String pid){
		_id = pid;
		_isEnemy = penemy;
		_isSolid = psolid;
		_rectangle = new Rectangle(px, py, pwidth, pheight);
		_velocity = pvelocity;
	}
	
	protected void init(Rectangle prectangle, int pvelocity, boolean penemy, boolean psolid,String pid){
		_id = pid;
		_isEnemy = penemy;
		_isSolid = psolid;
		_rectangle = prectangle;
		_velocity = pvelocity;
	}
	
	protected String createId(){
		return "graphic@" + _counter++;
	}
}
