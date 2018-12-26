package test.frame;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		super("두번째 프레임 어플리케이션");
		this.setBounds(0, 0, 400, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
