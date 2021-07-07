package CheckRadio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

class MyFrame extends JFrame implements ActionListener, ItemListener{
	
	JRadioButton movies = new JRadioButton("코미디");
	JRadioButton movies1 = new JRadioButton("액션");
	JRadioButton movies2 = new JRadioButton("성인");
	JCheckBox[] age = new JCheckBox[2];
	JCheckBox[] food = new JCheckBox[2];
	JRadioButton adult, youth;
	JLabel text;
	JPanel topPanel, sizePanel, resultPanel;
	String movieType;
	int sum, pay = 0;
	
	public MyFrame() {
		setTitle("영화 예매");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("영화 종류");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		ButtonGroup size = new ButtonGroup();
	// cola.addItemListener	
		sizePanel = new JPanel();
	//	movies = new JRadioButton("코미디");
	//	movies1 = new JRadioButton("액션");
	//	movies2 = new JRadioButton("성인");
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
		text = new JLabel ("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		text.setText( %f +"코미디가 선택되었습니다.", sizePanel);
		}
		
	}

public class CheckRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
