package game;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	public int x, y, size = 8;
	
	public Bullet(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(x-size/2, y-size/2, size, size);
	}
}
