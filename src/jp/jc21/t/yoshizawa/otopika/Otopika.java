/**
 * 
 */
package jp.jc21.t.yoshizawa.otopika;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author t.yoshizawa
 *
 */
public class Otopika extends JFrame  {
	public Otopika() {
		this.setSize(300, 300);
		this.setVisible(true);
	}

	private boolean power=false;
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void powerOn() {
		setPower(true);
		repaint();
	}
	public void powerOff() {
		setPower(false);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		if(isPower()==true) {
			g.setColor(Color.BLUE);
			g.fillOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 130, 20, 20);
			
			
		}else {
			g.setColor(Color.BLUE);
			g.drawOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 150, 20, 20);
			
		}
	}


}
