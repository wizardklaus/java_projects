package okjava0705;

import java.util.Scanner;

public class quiz0704 {
	public static void main(String[] args){
		int[] score=new int[5];
		int total=0;
		double average=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("국어,영어,수학,사회,과학 점수를 차례대로 넣어주세요 : ");
		
		for(int i=0;i<score.length;i++)
			score[i]=sc.nextInt();
		for(int i=0;i<score.length;i++)
			total+=score[i];
		average=total/5.0;
		
		System.out.println("총점은 "+total+"이며, 평균은 "+average+"입니다.");
	}
}
