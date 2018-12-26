package test.frame;

import javax.swing.*;
import java.awt.*;

public class ThirdFrame {

	public static void main(String[] args) {
		// 상속을 받지 않고 직접 JFrame 객체 생성하여 사용
		JFrame f = new JFrame("세번째 프레임 어플리케이션");
		f.setBounds(new Rectangle(0,0,400,300));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
