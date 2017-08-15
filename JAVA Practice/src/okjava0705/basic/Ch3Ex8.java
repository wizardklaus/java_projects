package okjava0705.basic;

import java.util.Scanner;

public class Ch3Ex8 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("## �α���(admin Ȥ�� ���� ���̵�) ##");
		System.out.print("# �α��� ���̵� : ");
		String user=scan.next();
		
		if(user.equals("admin"))
			System.out.println("������ �α���");
		else
			System.out.println(user+" �α���");
		
		System.out.println("## �޴��� ���� �ϼ���(1~2) ##");
		System.out.println("# �޴����� : ");
		
		String sel=scan.next();
		
		if(sel.equals("1")&&user.equals("admin"))
			System.out.println("������ 1�� ������");
		else if(sel.equals("2")&&user.equals("admin"))
			System.out.println("������ 2�� ������");
		else if(sel.equals("1")&&!user.equals("admin"))
			System.out.println(user+" 1�� ������");
		else if(sel.equals("2")&&!user.equals("admin"))
			System.out.println(user+" 2�� ������");
	}
}
