package mypack;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
@SuppressWarnings("serial")
public class myjava extends Applet{
	public void start(){	
	}
		public void init(){
			setBackground(Color.pink);
		}
		//Font f = new Font("Time Roman", Font.BOLD,Font.ITALIC);
		public void paint (Graphics g){
			
			g.drawString("HEllo World" ,100, 100);
			//g.setFont(f);
			//g.setColor(Color.blue);
			g.setColor(Color.red);
			g.fillRect(100, 200, 150, 200);
			
			g.setColor(Color.black);
			g.fillRect(500,200,100,150);
			
			g.setColor(Color.green);
			g.fillOval(900,200,50,100);	
			}
		public void stop(){
			
		}
	}

