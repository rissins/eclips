import java.awt.Component;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderTest extends JFrame implements ChangeListener {
	static final int INIT_VALUE = 15;
	private JButton buttonOK;
	private JSlider slider;
	private JButton button;
	
	public SliderTest() {
		JPanel panel;
		
		setTitle("슬라이더 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		JLabel label = new JLabel ("슬라이더를 ",JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);
		
		slider = new JSlider(0, 30, INIT_VALUE);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);
		panel.add(slider);
		
		button = new JButton("");
		ImageIcon icon = new ImageIcon("130.png");
		button.setIcon(icon);
		button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		panel.add(button);
		add(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		if (!source.getValueIsAdjusting()) {
			int value = (int) source.getValue();
			button.setSize(value * 10, value * 10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderTest();
	}

}
