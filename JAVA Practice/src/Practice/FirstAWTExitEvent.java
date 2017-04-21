package Practice;

import java.awt.*;
import java.awt.event.*;

public class FirstAWTExitEvent {
	public static void main(String[] args){
		Frame frm=new Frame("First Swing");
		frm.setBounds(120,120,400,400);
		frm.setLayout(new FlowLayout());
		
		WindowListener listen=new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				System.exit(0);
			}
		};
		
		frm.addWindowListener(listen);
		
		Button btn1=new Button("My Button");
		Button btn2=new Button("Your Button");
		Button btn3=new Button("Our Button");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
