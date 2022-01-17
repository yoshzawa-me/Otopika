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
public class Otopika extends JFrame {
	private boolean power = false;
	private boolean green = false;
	private boolean yellow = false;
	private boolean red = false;

	// constructor

	public Otopika() {
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// control method

	/**
	 * おとぴかの電源をONにする
	 */
	public void powerOn() {
		setPower(true);
		repaint();
	}

	/**
	 * おとぴかの電源をOFFにする
	 */
	public void powerOff() {
		setPower(false);
		repaint();
	}

	/**
	 * おとぴかのLEDをすべて消灯する
	 */
	public void lightOff() {
		setLed(false, false, false);
	}

	/**
	 * おとぴかのLEDを緑だけ点灯する
	 */
	public void lightGreen() {
		setLed(true, false, false);
	}

	/**
	 * おとぴかのLEDを黄色だけ点灯する
	 */
	public void lightYellow() {
		setLed(false, true, false);
	}

	/**
	 * おとぴかのLEDを赤だけ点灯する
	 */
	public void lightRed() {
		setLed(false, false, true);
	}

	/**
	 * おとぴかのLEDをすべて点灯する
	 */
	public void lightAll() {
		setLed(true, true, true);
	}

	/**
	 * おとぴかのLEDを緑と黄色を同時に点灯する
	 */
	public void lightGreenRed() {
		setLed(true, false, true);
	}

	/**
	 * おとぴかのLEDを黄色と赤を同時に点灯する
	 */
	public void lightGreenYellow() {
		setLed(true, true, false);
	}

	/**
	 * おとぴかのLEDを緑と赤を同時に点灯する
	 */
	public void lightYellowRed() {
		setLed(false, true, true);
	}

	public void sleep() {
		sleep(1);
	}

	public void sleep(float time) {
		try {
			Thread.sleep((long) (1000 * time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void setLed(boolean green, boolean yellow, boolean red) {
		setGreen(green);
		setYellow(yellow);
		setRed(red);
		if (isPower() == true) {
			repaint();
		}
	}

	// setters and getters

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	private boolean isGreen() {
		return green;
	}

	private void setGreen(boolean green) {
		this.green = green;
	}

	private boolean isYellow() {
		return yellow;
	}

	private void setYellow(boolean yellow) {
		this.yellow = yellow;
	}

	private boolean isRed() {
		return red;
	}

	private void setRed(boolean red) {
		this.red = red;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 300, 300);

		if (isPower() == true) {
			g.setColor(Color.BLUE);
			g.fillOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 130, 20, 20);

		} else {
			g.setColor(Color.BLUE);
			g.drawOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 150, 20, 20);

		}
		if (isGreen() == true) {
			g.setColor(Color.GREEN);
			g.fillOval(20, 60, 50, 50);
		}
		if (isYellow() == true) {
			g.setColor(Color.yellow);
			g.fillOval(120, 60, 50, 50);
		}
		if (isRed() == true) {
			g.setColor(Color.red);
			g.fillOval(220, 60, 50, 50);
		}
	}

}
