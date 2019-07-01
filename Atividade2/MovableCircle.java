package atividade2_Geometria;

public class MovableCircle implements Movable {
	
	int radius;
	MovablePoint center;
	
	public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint (x, y, xSpeed, ySpeed);
	}
	
	public void moveUp() {
		this.center.moveUp();
	}
	public void moveDown() {
		this.center.moveDown();
	}
	public void moveLeft() {
		this.center.moveLeft();
	}
	public void moverRight() {
		this.center.moverRight();
	}
	
	public String toString () {
		return this.center.toString()+"Raio: "+this.radius;
		
	}

}
