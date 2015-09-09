import java.awt.Graphics;

import javax.swing.JApplet;


public class HappyFace extends JApplet {
	public void paint(Graphics canvas)
	{
		super.paint(canvas);
		canvas.drawOval(100, 60, 200, 200);
		canvas.drawOval(60, 40, 70, 70);
		canvas.drawOval(40, 30, 30, 30);
		canvas.fillOval(42, 36, 8, 10);
		canvas.fillOval(52, 36, 8, 10);
		canvas.drawArc(41, 50, 20, 5, 40, 40);
		canvas.drawLine(20, 20, 40, 40);
		canvas.drawLine(40, 40, 20, 20);
		canvas.drawString("It's Snowman Time!", 150, 200);
	}
}