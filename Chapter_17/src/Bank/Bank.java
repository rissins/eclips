package Bank;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.sql.Date;

class MyFrame extends JFrame implements ActionListener{
	private double amount;
	private Date date;
	
	private JLabel amount
	
	private JFormattedTextField dateField;
	private JFormattedTextField amountField;
	
	public MyFrame() {
		setSize(300, 300);
		setTitle("예금이자계산");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		amountField = new JFormattedTextField(new NumberFormatter());
		amountField.setValue(new Integer(100));
		amountField.setColumns(10);
		amountField.addPropertyChangeListener("value", this);
		
		dateField = new JFormattedTextField(new DataFormatter());
		dateField.setValue(new Date());
		dateField.setColumns(10);
		dateField.addPropertyChangeListener("value", this);
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
