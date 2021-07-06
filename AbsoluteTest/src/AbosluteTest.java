import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	JButton b1;
	private JButton b2, b3;
	
	public MyFrame() {
		setTitle("Absolute Psition Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		b1 = new JButton("Button #1");
		p.add(b1);
		b2 = new JButton("Button #2");
		p.add(b2);
		b3 = new JButton("Button #3");
		p.add(b3);
		
		b1.setBounds(120, 10, 95, 30);
		b2.setBounds(90, 45, 105, 90);
		b3.setBounds(180, 30, 105, 90);
		add(p);
		setVisible(true);
	}
}
public class AbosluteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
