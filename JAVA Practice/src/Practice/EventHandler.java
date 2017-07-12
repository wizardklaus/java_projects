package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e){
		JButton button=(JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("���콺 ��ư ���ȴ� Ǯ��.");
	}
	
	public void mouseEntered(MouseEvent e){
		System.out.println("Ŀ�� ��ư �� ����");
	}
	
	public void mouseExited(MouseEvent e){
		System.out.println("Ŀ�� ��ư �� Ż��");
	}
	
	public void mousePressed(MouseEvent e){
		System.out.println("���콺 ��ư ����");
	}
	
	public void mouseReleased(MouseEvent e){
		System.out.println("���콺 ��ư Ǯ��");
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
