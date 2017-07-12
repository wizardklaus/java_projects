package Practice;

import javax.swing.*;
import java.awt.event.*;

class MouseEventHandler extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		System.out.println("마우스 버튼 눌렸다 풀림");
	}
}

public class AdapterEventHandling {
	public static void main(String[] args){
		JFrame frm=new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseListener(new MouseEventHandler());
		
		frm.add(new JButton("One"));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
