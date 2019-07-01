package atividade2_Geometria;

public class MovableRectangle implements Movable {
	
	MovablePoint ponto1;
	MovablePoint ponto2;
	
	public MovableRectangle (int x, int y, int x1, int y1, int xSpeed, int ySpeed) {
		this.ponto1 = new MovablePoint (x, y, xSpeed, ySpeed);
		this.ponto2 = new  MovablePoint (x1, y1, xSpeed, ySpeed);
	}
	public void moveUp() {
		this.ponto1.moveUp();
		this.ponto2.moveUp();
	}
	public void moveDown() {
		this.ponto1.moveDown();
		this.ponto2.moveDown();
	}
	public void moveLeft() {
		this.ponto1.moveLeft();
		this.ponto2.moveLeft();
	}
	public void moverRight() {
		this.ponto1.moverRight();
		this.ponto2.moverRight();
	}
	public String toString () {
		return this.ponto1.toString()+"\n"+this.ponto2.toString();
	}

}
