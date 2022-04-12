package model.entities;

public class Position {
	private int positionX;
	private int positionY;
	
	public Position(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public void setPositionY (int positionY) {
		this.positionY = positionY;
	}
	
	@Override
	public String toString() {
		return "Position: " + this.positionX + ", " + this.positionY;
	}

}
