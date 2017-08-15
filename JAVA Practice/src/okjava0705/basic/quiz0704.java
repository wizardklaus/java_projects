package okjava0705.basic;

import java.util.Scanner;

public class quiz0704 {
	public static void main(String[] args){
		int[] score=new int[5];
		int total=0;
		double average=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����,����,����,��ȸ,���� ������ ���ʴ�� �־��ּ��� : ");
		
		for(int i=0;i<score.length;i++)
			score[i]=sc.nextInt();
		for(int i=0;i<score.length;i++)
			total+=score[i];
		average=total/5.0;
		
		System.out.println("������ "+total+"�̸�, ����� "+average+"�Դϴ�.");
	}
}
