package designpattern.flyweight;

public class Ball {
	public String color;
	public String imageUrl;
	private int x;
	private int y;
	private int radius;

	public Ball(String color, String imageUrl) {
		super();
		this.color = color;
		this.imageUrl = imageUrl;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", imageUrl=" + imageUrl + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
}
