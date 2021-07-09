import java.awt.*;

import javax.swing.*;


public static class MyFrame extends JFrame{
	public MyFrame() {
		
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레asdsad");
		JButton button = new JButton("버튼");
		JButton button1 = new JButton("버튼");
		JLabel label = new JLabel("안녕하세요");
		JPanel panel = new JPanel(); 
		JPanel panel1 = new JPanel();
		JTextField t1 = new JTextField(30);
		JTextField t2 = new JTextField(10);
		t2.setText("adfsdaf");
	//	t1.setEditable(false);
		t2.setEditable(false);
		panel.add(button);
		panel1.add(button1);
		panel.add(label);
		panel.add(t1);
		panel1.add(t2);
		panel.setLayout(new CardLayout());
		add(panel);
		setVisible(true);
	}
}
public class exx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();

	}

}
