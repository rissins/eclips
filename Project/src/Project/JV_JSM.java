package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JLabel hintLabel;
    JLabel countLable;
    JPanel bottomPanel = new JPanel();
    JPanel topPanel = new JPanel();

    Container mainContainer = this.getContentPane();

    ArrayList<String> list = new ArrayList<>();
    int count = 0;

    MyFrame() {
        mainContainer.setBackground(Color.GRAY);

        mainContainer.setLayout(new GridLayout(2, 1));

        this.setSize(650, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("방명록");

        topPanel.add(new JPanel(), BorderLayout.CENTER);
        
        button = new JButton("OK");
        button.addActionListener(this);
        hintLabel = new JLabel("내용을 쓰세요:");
        textField = new JTextField(10);
        countLable = new JLabel(count + "명");
        textField.setEditable(true);

        add(BorderLayout.WEST, bottomPanel);
        textField.addActionListener(this);

        topPanel.setLayout(new GridLayout(1, 4));
        topPanel.setLayout(null);
        topPanel.add(hintLabel, BorderLayout.NORTH);
        topPanel.add(textField, BorderLayout.NORTH);
        topPanel.add(button, BorderLayout.NORTH);
        topPanel.add(countLable, BorderLayout.NORTH);
        button.setBounds(400, 20, 70, 30);
        textField.setBounds(240, 20, 150, 32);
        hintLabel.setBounds(150, 20, 150, 30);
        countLable.setBounds(480, 20, 70, 30);
        bottomPanel.setLayout(new GridLayout(8, 3));
        topPanel.setBounds(500, 20, 70, 30);
        add(topPanel);
        add(bottomPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JLabel label = new JLabel();
            label.setText(textField.getText());
            bottomPanel.add(label, BorderLayout.CENTER);
            count++;
            countLable.setText(count + "명");
            System.out.println(count + "명");

            if (count == 100) {
                System.exit(0);
            }
        }
    }
}

public class JV_JSM {

    public static void main(String[] args) {

        MyFrame f = new MyFrame();
    }
}