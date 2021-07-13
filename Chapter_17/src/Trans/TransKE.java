package Trans;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Trans extends JFrame implements ActionListener {
	String[] Koreans = {"사과", "나무", "물", "연필"};
	String[] English = {"apple", "tree", "water", "pencle"};
	JTextArea  KTA;
	JTextArea  ETA;
	JButton ok;
	JButton cancle;
	
	
	Trans(){
		
		setTitle("텍스트 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		KTA = new JTextArea(30,10);
		ETA = new JTextArea(30,10);
		ok = new JButton("OK");
		cancle = new JButton("Cancle");
		
		ok.addActionListener(this);
		
		JPanel kpanel = new JPanel();
		JPanel epanel = new JPanel();
		
		kpanel.add(KTA);
		kpanel.add(ETA);
		
		epanel.add(ok);
		epanel.add(cancle);
		
		this.add(kpanel);
		add(epanel, BorderLayout.SOUTH);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok) {
			String word = KTA.getText();
			for (int i = 0; i < Koreans.length; i++)
				if(word.equals(Koreans[i])) {
					ETA.setText(English[i]);
					
				}
		}
	}
}
public class TransKE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Trans();
	}

}
