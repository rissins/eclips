package aa;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ButtonNine extends JPanel implements ActionListener {
	private JButton[] Button9 = new JButton[10];
	
	public ButtonNine() {
		setLayout(new GridLayout(0,3));
		for (int i =0 ; i < Button9.length ; i++) {
			//String num = ""+i;
			String num = Integer.toString(i);
			Button9[i] = new JButton(num);
			add(Button9[i]);
			Button9[i].addActionListener(this);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i<10 ;i++ ) {
			if (e.getSource() == Button9[i]) {
				System.out.print(i);
			}
		}
	}  
}

public class buttonTest extends JFrame {
	public buttonTest () {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("버튼확인");
		add(new ButtonNine());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buttonTest t = new buttonTest();

	}

}
