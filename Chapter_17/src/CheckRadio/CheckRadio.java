package CheckRadio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

class MyFrame extends JFrame implements ActionListener, ItemListener{
	
	JRadioButton movies = new JRadioButton("�ڹ̵�");
	JRadioButton movies1 = new JRadioButton("�׼�");
	JRadioButton movies2 = new JRadioButton("����");
	JCheckBox[] age = new JCheckBox[2];
	JCheckBox[] food = new JCheckBox[2];
	JRadioButton adult, youth;
	JLabel text;
	JPanel topPanel, sizePanel, resultPanel;
	String movieType;
	int sum, pay = 0;
	
	public MyFrame() {
		setTitle("��ȭ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("��ȭ ����");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		ButtonGroup size = new ButtonGroup();
	// cola.addItemListener	
		sizePanel = new JPanel();
	//	movies = new JRadioButton("�ڹ̵�");
	//	movies1 = new JRadioButton("�׼�");
	//	movies2 = new JRadioButton("����");
		size.add(movies);
		size.add(movies1);
		size.add(movies2);
		movies.addActionListener(this);
		movies1.addActionListener(this);
		movies2.addActionListener(this);
		sizePanel.add(movies);
		sizePanel.add(movies1);
		sizePanel.add(movies2);
		
		
		add(sizePanel, BorderLayout.CENTER);
		resultPanel = new JPanel();
		text = new JLabel ("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		text.setText( %f +"�ڹ̵� ���õǾ����ϴ�.", sizePanel);
		}
		
	}

public class CheckRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
