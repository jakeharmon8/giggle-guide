package game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	public int x = 256, y = 400, size = 32;
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x-size/2, y-size/2, size, size);
	}
}
