import java.awt.*;

import javax.swing.*;


class MyFrame extends JFrame{
	public MyFrame() {
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레asdsad");
		JButton button = new JButton("버튼");
		JButton button1 = new JButton("버튼");
		JLabel label = new JLabel("안녕하세요");
		JPanel panel = new JPanel(); 
		JPanel panel1 = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setText("adfsdaf");
		t1.setEditable(true);
		t2.setEditable(true);
		panel.add(button);
		panel.add(button1);
		panel.add(label);
		panel.add(t1);
		panel.add(t2);
		panel.setLayout(new FlowLayout());
		add(panel);
		setVisible(true);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myfram1 = new MyFrame();

	}

}
