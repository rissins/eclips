import javax.swing.JLabel;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class CountDownTest extends JFrame implements ActionListener {
	private JLabel label;
	public JButton button;
	public JTextField TF;
	public int num=10;
	

	
	
	class MyThread extends Thread{
		public void run() {
			for (int i = 10; i>= 0; i--) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText("     " + i + "     ");
			}
		}
	}
	


	public CountDownTest(){
		
		setTitle("카운트다운");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button = new JButton("OK");
		TF = new JTextField(10);
		
		
		label = new JLabel("     Start     ");
		label.setFont(new Font("SErif", Font.BOLD, 100));
		button.addActionListener(this);
		
		panel1.add(label, BorderLayout.NORTH);
		panel2.add(button, BorderLayout.SOUTH);
		panel2.add(TF, BorderLayout.SOUTH);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
	//	(new MyThread()).start();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownTest t = new CountDownTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			num = Integer.parseInt(TF.getText());
			(new MyThread()).start();
			
		}
	}

}
