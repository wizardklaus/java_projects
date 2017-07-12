package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e){
		JButton button=(JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("마우스 버튼 눌렸다 풀림.");
	}
	
	public void mouseEntered(MouseEvent e){
		System.out.println("커서 버튼 위 진입");
	}
	
	public void mouseExited(MouseEvent e){
		System.out.println("커버 버튼 위 탈출");
	}
	
	public void mousePressed(MouseEvent e){
		System.out.println("마우스 버튼 눌림");
	}
	
	public void mouseReleased(MouseEvent e){
		System.out.println("마우스 버튼 풀림");
	}
}

public class EventHandler {
	public static void main(String[] args){
		JFrame frm=new JFrame("First Swing");
		frm.setBounds(120,120,400,120);
		frm.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("My Button");
		MouseListener listener=new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2=new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3=new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
