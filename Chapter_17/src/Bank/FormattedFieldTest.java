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
	// �ʵ� ����
	private double amount = 100000;
	private Date date;

	// �ʵ��� �̸��� ǥ���ϴ� ���̺�
	private JLabel amountLabel, amountCheckLabel;
	private JLabel dateLabel;
	private JButton result;

	// ������ �Է��� ���� ������
	private JFormattedTextField amountField;
	private JFormattedTextField dateField;

	public MyFrame() {
		super();
		// ���̺��� �����Ѵ�.
		amountLabel = new JLabel("�ݾ�: ");
		dateLabel = new JLabel("��¥: ");
		amountCheckLabel = new JLabel("0");
	
		//��ư�� �����Ѵ�.
		result = new JButton("Ȯ��");
		result.addActionListener(this);

		// ���ڸ� �Է¹��� �� �ִ� �ؽ�Ʈ �ʵ带 �����ϰ� �Ӽ��� �����Ѵ�.
		amountField = new JFormattedTextField(new NumberFormatter());
		amountField.setValue(new Integer(100));
		amountField.setColumns(10);
		amountField.addActionListener(this);

		// ��¥�� �Է¹��� �� �ִ� �ؽ�Ʈ �ʵ带 �����ϰ� �Ӽ��� �����Ѵ�.
		dateField = new JFormattedTextField(new DateFormatter());
		dateField.setValue(new Date());
		dateField.setColumns(10);
		
		// �гο� �ؽ�Ʈ �ʵ带 ��ġ�Ѵ�.
		setLayout(new GridLayout(0,1));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		

		panel1.add(amountLabel);
		panel1.add(amountField);
		
		Border border = BorderFactory.createTitledBorder("�ݾ�");
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

	
	// ��ư�� ������ ȣ�� �ȴ�.
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == result || source == amountField ) {
			double result = ((Number)amountField.getValue()).doubleValue()*3*0.015;
			amountCheckLabel.setText( "3�� ����� ���� : "+result );
			System.out.println(result);
		}
	}
}

public class FormattedFieldTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

}
