package test.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

// 이벤트 동작처리를 담당할 이벤트 핸들러 클래스는 반드시 해당 이벤트에 대한 인터페이스나 어댑터 클래스를
// 상속받아야 한다.

public class ActionHandler implements ActionListener{
	// Field
	private MainFrame mf;
	public ActionHandler(MainFrame mf) {
		this.mf = mf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// MainFrame의 btn1이 클릭되었을 때 실행 될 기능
		JOptionPane.showMessageDialog(mf, e.getActionCommand()+ "버튼 클릭하였음..", "버튼 클릭", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
