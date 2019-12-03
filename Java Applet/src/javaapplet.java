import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class javaapplet extends Applet{
	Font f = new Font("Time Roman", Font.BOLD,Font.ITALIC);
	public void paint (Graphics g){
		
		g.drawString("HEllo World", 25, 50);
		
		g.setFont(f);
		g.setColor(Color.red);
		
	}

}
