package MovieTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame extends JFrame implements ActionListener, ItemListener {

	private JRadioButton comedi, act, adultM;
	private JRadioButton adultA ,teen;
	private JLabel text;
	private JPanel moviePanel, agePanel, foodPanel, resultPanel;
	private JCheckBox cola, popcon;
	String movieType;
	int sum, pay = 0;

	public MyFrame() {
		setTitle("라디오 버튼 테스트");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout( new GridLayout(0,1));
		
		moviePanel = new JPanel();
		comedi = new JRadioButton("코미디");
		act = new JRadioButton("액션");
		adultM = new JRadioButton("성인");
		
		ButtonGroup movie = new ButtonGroup();
		movie.add(comedi);
		movie.add(act);
		movie.add(adultM);
		comedi.addActionListener(this);
		act.addActionListener(this);
		adultM.addActionListener(this);
		moviePanel.add(comedi);
		moviePanel.add(act);
		moviePanel.add(adultM);
		add(moviePanel);
		

		agePanel = new JPanel();
		adultA = new JRadioButton("일반");
		teen = new JRadioButton("청소년");

		ButtonGroup age = new ButtonGroup();
		age.add(adultA);
		age.add(teen);
		adultA.addActionListener(this);
		teen.addActionListener(this);
		agePanel.add(adultA);
		agePanel.add(teen);
		add(agePanel);
		
		foodPanel = new JPanel();
		cola = new JCheckBox("콜라");
		cola.addItemListener(this);
		popcon = new JCheckBox("팝콘");
		popcon.addItemListener(this);
		foodPanel.add(cola);
		foodPanel.add(popcon);
		add(foodPanel);

		resultPanel = new JPanel();
		text = new JLabel("선택하세요.");
		resultPanel.add(text);
		add(resultPanel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comedi) {
			teen.setEnabled(true);
			movieType = "코미디";
			text.setText(movieType);
		}
		if (e.getSource() == act) {
			teen.setEnabled(true);
			movieType = "액션";
			text.setText(movieType);
		}
		if (e.getSource() == adultM) {
			teen.setEnabled(false);
			movieType = "성인";
			text.setText(movieType);
		}if (e.getSource() == adultA) {
			pay = 13000;
		}if (e.getSource() == teen) {
			pay = 10000;
		}
		text.setText(movieType +"가격은" + pay);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == cola) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				pay +=3000;
			}else {
				pay -=3000;
			}
			
		}if (e.getSource() == popcon) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				pay +=5000;
			}else {
				pay -=5000;
			}
			
		}
		text.setText(movieType +"가격은" + pay);
		
	}
}
public class MovieTest extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
