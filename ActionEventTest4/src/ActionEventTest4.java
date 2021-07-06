import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	MyListener listener = new MyListener();
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("핑크색");
		button2.addActionListener(listener);
		panel.add(button2);
		button3 = new JButton("파란색");
		button3.addActionListener(listener);
		panel.add(button3);
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.yellow);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.MAGENTA);
			} else if (e.getSource() == button3 ) {
				panel.setBackground(Color.blue);
		}
		}	
	}
}
public class ActionEventTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
