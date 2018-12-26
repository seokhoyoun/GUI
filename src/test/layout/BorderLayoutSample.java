package test.layout;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutSample extends JFrame{
	// Field
	private JButton eastBtn, westBtn,southBtn,northBtn,centerBtn;
	
	public BorderLayoutSample() {
		super("BorderLayout Test");
		this.setBounds(new Rectangle(0,0,400,400));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		// 컴포넌트에 대한 배치방식 지정
		// 프레임의 기본 레이아웃은 BorderLayout 이다.
		//this.setLayout(new BorderLayout())
		// 보더 레이아웃은 각 구역별로 컴포넌트 한 개씩 배치할 수 있다.
		// 컴포넌트의 크기도 지정할 수 없음
		// 구역의 크기에 맞춰짐
		
		eastBtn = new JButton("동쪽버튼");
		westBtn = new JButton("서쪽버튼");
		southBtn = new JButton("남쪽버튼");
		northBtn = new JButton("북쪽버튼");
		centerBtn = new JButton("센터버튼");
		
		// 정해진 배치방식에 따라 각 구역에 컴포넌트 배치함 
		this.add(eastBtn, BorderLayout.EAST);
		this.add(westBtn, BorderLayout.WEST);
		this.add(southBtn, BorderLayout.SOUTH);
		this.add(northBtn, BorderLayout.NORTH);
		this.add(centerBtn, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
