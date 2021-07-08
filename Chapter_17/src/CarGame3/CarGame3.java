package CarGame3;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	BufferedImage img_buffer = null;
	int img_x = 0, img_y = 0;


	public MyPanel() {
	try {
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {

		System.out.println("no image");
		System.exit(1);
	}
	addMouseMotionListener(new MouseMotionAdapter() { 
		public void mouseDragged(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
	});
	addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_ENTER) {
				if(img != null) {
					img_buffer = img;
					img = null;
				}
				else
					img = img_buffer;
			}
			repaint();
		}

	});
	this.requestFocus();
	setFocusable(true);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGame3 extends JFrame {
	public CarGame3() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame3 s = new CarGame3();
	}
}