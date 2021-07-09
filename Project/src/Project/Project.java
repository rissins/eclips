package Project;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	JButton button1;
	JTextField textfield1;
	JLabel label1; 
	JLabel label2;
	JPanel panel;
	JPanel panel1;
	JLabel[] label3;
	MyListener listener = new MyListener();
	int count = 0;
	MyFrame(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("방명록");
		panel = new JPanel();
		button1 = new JButton("OK");
		button1.addActionListener(listener);
		label1 = new JLabel("내용을 쓰세요:");
		textfield1 = new JTextField(10);
		label2 = new JLabel(count + "명");
		textfield1.setEditable(true);
		panel.add(label1);
		panel.add(label1);
		panel.add(textfield1);
		panel.add(button1);
		this.add(panel);
		this.setVisible(true);
	}
	public class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				label2 = new JLabel(count + "명");
				count++;
			}			
	}
}
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}
}
}

