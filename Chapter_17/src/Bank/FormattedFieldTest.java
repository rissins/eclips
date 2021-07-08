package Bank;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

class MyFrame extends JFrame implements  ActionListener {
	// 필드 정의
	private double amount = 100000;
	private Date date;

	// 필드의 이름을 표시하는 레이블
	private JLabel amountLabel, amountCheckLabel;
	private JLabel dateLabel;
	private JButton result;

	// 데이터 입력을 위한 포매터
	private JFormattedTextField amountField;
	private JFormattedTextField dateField;

	public MyFrame() {
		super();
		// 레이블을 생성한다.
		amountLabel = new JLabel("금액: ");
		dateLabel = new JLabel("날짜: ");
		amountCheckLabel = new JLabel("0");
	
		//버튼을 생성한다.
		result = new JButton("확인");
		result.addActionListener(this);

		// 숫자를 입력받을 수 있는 텍스트 필드를 생성하고 속성을 설정한다.
		amountField = new JFormattedTextField(new NumberFormatter());
		amountField.setValue(new Integer(100));
		amountField.setColumns(10);
		amountField.addActionListener(this);

		// 날짜를 입력받을 수 있는 텍스트 필드를 생성하고 속성을 설정한다.
		dateField = new JFormattedTextField(new DateFormatter());
		dateField.setValue(new Date());
		dateField.setColumns(10);
		
		// 패널에 텍스트 필드를 배치한다.
		setLayout(new GridLayout(0,1));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		

		panel1.add(amountLabel);
		panel1.add(amountField);
		
		Border border = BorderFactory.createTitledBorder("금액");
		panel1.setBorder(border);
		
		panel2.add(dateLabel);
		panel2.add(dateField);
		add(panel1);
		add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.add(result);
		add(panel3);
		JPanel panel4 = new JPanel();
		panel4.add(amountCheckLabel);
		panel4.setBackground(Color.PINK);
		add(panel4);
		
		
		pack();
		setVisible(true);
	}

	
	// 버튼을 누르면 호출 된다.
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == result || source == amountField ) {
			double result = ((Number)amountField.getValue()).doubleValue()*3*0.015;
			amountCheckLabel.setText( "3년 만기시 이자 : "+result );
			System.out.println(result);
		}
	}
}

public class FormattedFieldTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

}
