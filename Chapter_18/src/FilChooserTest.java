import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FileChooserTest extends JFrame implements ActionListener {
	JButton openButton, saveButton;
	JFileChooser fc;
	JLabel l1;

	public FileChooserTest() {
		setTitle("���� ���ñ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		fc = new JFileChooser();

		JLabel label = new JLabel("���� ���ñ� ������Ʈ �׽�Ʈ�Դϴ�.");
		l1 = new JLabel("");
		openButton = new JButton("���� ����");
		openButton.addActionListener(this);

		saveButton = new JButton("���� ����");
		saveButton.addActionListener(this);

		JPanel panel = new JPanel();
		JPanel p2 = new JPanel();
		panel.add(label);
		panel.add(openButton);
		panel.add(saveButton);
		p2.add(l1);
		add(panel, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		// ������ ���¡���ư�� ���� �׼� �̺�Ʈ ó��
		if (e.getSource() == openButton) {
			int returnVal = fc.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// ���� ������ �����Ѵ�.
				File file = fc.getSelectedFile();
				System.out.println(file.getPath());
				ImageIcon icon = new ImageIcon(file.getPath());
				l1.setIcon(icon);
				
			} else {
				// ����� ���
			}

			// ������ ���塱��ư�� ���� �׼� �̺�Ʈ ó��
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// ���� ���Ͽ� �����Ѵ�.
			} else {
				// ����� ���
			}
		}
	}

	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}
