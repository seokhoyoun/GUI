package test.frame;

import javax.swing.*;
import java.awt.*;


// 윈도우 창을 구성할 첫번째 방법
// 실행용 클래스가 JFrame을 상속 받는 경우
public class FirstFrame extends JFrame{
	
	public FirstFrame() {
		this.setTitle("첫번째 GUI 어플리케이션");
		this.setLocation(200, 200);
		this.setSize(500, 650);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		// 모든 창의 컴포넌트 구성과 배치가 끝나면, 맨 마지막에 사용해야 함.
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstFrame();

	}

}
