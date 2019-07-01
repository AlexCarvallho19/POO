package atividade2_Geometria;

public class MovablePoint implements Movable{
	
	int x ;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void moveUp() {
		this.y += this.ySpeed;
	}
	public void moveDown() {
		this.y -= this.ySpeed;
	}
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	public void moverRight() {
		this.x += this.xSpeed;
	}
	
	public String toString () {
		return "x:" +this.x+"\ny:" +this.y+"\nxSpeed:" +this.xSpeed+"\nySpeed:" +this.ySpeed;
		
	}
	
	
}
