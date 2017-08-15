package okjava0705.basic;

import java.util.Scanner;

public class Gugudan {
	public Gugudan(int dan){
		for(int i=1;i<10;i++){
			System.out.printf("%d * %d = %d",dan,i,dan*i);
			System.out.println();
		}
	}
	
	public void guguAll(){
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.printf("%d * %d = %d",i,j,i*j);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args){
		int dan;
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ��� : ");
		dan=sc.nextInt();
		Gugudan app=new Gugudan(dan);
	}
}