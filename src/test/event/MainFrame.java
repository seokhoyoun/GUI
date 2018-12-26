package test.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener{
	// Field
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	// Constructor
	public MainFrame() {
		super("이벤트 처리 테스트");
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("별도의 이벤트 핸들러 구동");
		btn1.addActionListener(new ActionHandler(this));
		
		// 컴포넌트에 이벤트 설정함
		// 컴포넌트 레퍼런스 .add이벤트Listener(이벤트핸들러);
		// 해당 이벤트가 발생했을 때, 동작 처리를 담당할 클래스를 이벤트 핸들러라고 함.
		btn2 = new JButton("내부클래스로 이벤트 처리");
		btn2.addActionListener(new InActionHandler());
		
		btn3 = new JButton("프레임이 이벤트 핸들러");
		btn3.addActionListener(this);
		
		btn4 = new JButton("익명 클래스로 이벤트 처리");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// btn4 클릭했을 때의 동작처리
				JOptionPane.showMessageDialog(getParent(), e.getActionCommand()+" 버튼 클릭", "버튼 클릭", JOptionPane.INFORMATION_MESSAGE);
			}});
		
		btn5 = new JButton("java.beans.EventHandler");
		btn5.addActionListener((ActionListener)java.beans.EventHandler.create(ActionListener.class, this, "showDlg"));
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		this.setVisible(true);
	}
	// 내부(Inner | Nested) 클래스로 이벤트핸들러 클래스 작성
	// 내부클래스는 클래스의 멤버가 됨
	// 4가지 접근제한자와 static을 사용가능
	
	private class InActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// btn2를 클릭했을 때의 동작처리
			JOptionPane.showMessageDialog(getParent(), e.getActionCommand() + "버튼 클릭");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// btn3을 클릭했을 때의 동작처리
		JOptionPane.showMessageDialog(getParent(), e.getActionCommand()+" 버튼 클릭 ");
	}
	// EventHandler에 의해 실행 될 메소드
	public void showDlg() {
		JOptionPane.showMessageDialog(getParent(), btn5.getText()+" 버튼 클릭");
	}
}
