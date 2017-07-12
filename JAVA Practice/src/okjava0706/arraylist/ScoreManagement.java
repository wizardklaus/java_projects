package okjava0706.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/** 성적관리프로그램
 * 학번(int), 이름(String)
 * 과목(String), 점수(int)
 * ScoreManagement 기능
 * 성적입력
 * 학번입력 >> 000 홍길동 학생성적입력
 * 과목명과 성적을 반복해서 입력
 * socres ArrayList 추가
 * 성적 조회
 * 학번 입력 후 해당 학생
 * 과목 성적 목록 출력하고 총점, 평균 출력
 * @author wizardklaus
 *
 */
public class ScoreManagement {
	ArrayList<Student> sdata=new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
	
	public void genStudent(){
		Student s=new Student(1010101,"유나");
		sdata.add(s);
		s=new Student(1010102,"하나");
		sdata.add(s);
		s=new Student(1010103,"사나");
		sdata.add(s);
	}
	
	Student findStudent(int id){
		Student s=null;
		
		for(Student ss:sdata){ //sdata ArrayList로부터 해당 학번 학생을 찾아 리턴
			if(ss.getId()==id)
				s=ss;
		}
		return s;
	}
	
	void scoreInput(){
		//성적입력 학생 학번 입력, 성적입력(과목,학점) q를 입력하면 종료 -> prtStudent()
		System.out.println("# 성적을 입력할 학생 학번 : ");
		int id=sc.nextInt();
		Student s=findStudent(id);
		System.out.printf("%d, %s 학생의 성적입력(종료q)",s.getId(),s.getName());
		
		while(true){
			System.out.print("# 과목 : ");
			String subject=sc.next();
			if(subject.equals("q"))
				prtStudent();
			
			System.out.print("# 점수 : ");
			int score=sc.nextInt();
			Score c=new Score(subject,score);
			s.getScores().add(c);
		}
	}

	public void scoreView(){
		//학번을 입력받아 해당학생의 성적 목록(과목, 성적)과 총점, 평균을 출력
		System.out.println("# 성적을 입력할 학생 학번 : ");
		int id=sc.nextInt();
		Student s=findStudent(id);
		System.out.println("***************");
		System.out.println("*** 성 적 조 회   ***");
		System.out.println("***************");
		
		int total=0;
		for(Score score:s.getScores()){
			System.out.printf("%s\t\t%s",score.getSubject(),score.getScore());
			System.out.println();
			total=total+(score.getScore());
		}
		System.out.println("=====================");
		System.out.printf("총점 : %d, 평균 : %d 입니다.",total,total/s.getScores().size());
		
		prtStudent();
	}
	
	void prtStudent(){
		System.out.println("=======================");
		System.out.println("##      학생명단                 ##");
		System.out.println("=======================");
		System.out.println("학번\t\t이름");
		System.out.println("=======================");
		for(Student s:sdata){
			System.out.printf("%d\t\t%s", s.getId(),s.getName());
			System.out.println();
		}
		System.out.println("=======================");
		System.out.print("[1]성적입력 [2]성적조회 [0]종료 --->");
		int sel=sc.nextInt();
		
		switch(sel){
		case 1:
			scoreInput(); break;
		case 2:
			scoreView(); break;
		case 0:
			System.exit(0); break;
		default : System.out.println("잘못선택했습니다.");
		}
	}
	
	public static void main(String[] args){
		ScoreManagement sm=new ScoreManagement();
		sm.genStudent();
		sm.prtStudent();
	}
}
