package okjava0706.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/** �����������α׷�
 * �й�(int), �̸�(String)
 * ����(String), ����(int)
 * ScoreManagement ���
 * �����Է�
 * �й��Է� >> 000 ȫ�浿 �л������Է�
 * ������ ������ �ݺ��ؼ� �Է�
 * socres ArrayList �߰�
 * ���� ��ȸ
 * �й� �Է� �� �ش� �л�
 * ���� ���� ��� ����ϰ� ����, ��� ���
 * @author wizardklaus
 *
 */
public class ScoreManagement {
	ArrayList<Student> sdata=new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
	
	public void genStudent(){
		Student s=new Student(1010101,"����");
		sdata.add(s);
		s=new Student(1010102,"�ϳ�");
		sdata.add(s);
		s=new Student(1010103,"�糪");
		sdata.add(s);
	}
	
	Student findStudent(int id){
		Student s=null;
		
		for(Student ss:sdata){ //sdata ArrayList�κ��� �ش� �й� �л��� ã�� ����
			if(ss.getId()==id)
				s=ss;
		}
		return s;
	}
	
	void scoreInput(){
		//�����Է� �л� �й� �Է�, �����Է�(����,����) q�� �Է��ϸ� ���� -> prtStudent()
		System.out.println("# ������ �Է��� �л� �й� : ");
		int id=sc.nextInt();
		Student s=findStudent(id);
		System.out.printf("%d, %s �л��� �����Է�(����q)",s.getId(),s.getName());
		
		while(true){
			System.out.print("# ���� : ");
			String subject=sc.next();
			if(subject.equals("q"))
				prtStudent();
			
			System.out.print("# ���� : ");
			int score=sc.nextInt();
			Score c=new Score(subject,score);
			s.getScores().add(c);
		}
	}

	public void scoreView(){
		//�й��� �Է¹޾� �ش��л��� ���� ���(����, ����)�� ����, ����� ���
		System.out.println("# ������ �Է��� �л� �й� : ");
		int id=sc.nextInt();
		Student s=findStudent(id);
		System.out.println("***************");
		System.out.println("*** �� �� �� ȸ   ***");
		System.out.println("***************");
		
		int total=0;
		for(Score score:s.getScores()){
			System.out.printf("%s\t\t%s",score.getSubject(),score.getScore());
			System.out.println();
			total=total+(score.getScore());
		}
		System.out.println("=====================");
		System.out.printf("���� : %d, ��� : %d �Դϴ�.",total,total/s.getScores().size());
		
		prtStudent();
	}
	
	void prtStudent(){
		System.out.println("=======================");
		System.out.println("##      �л����                 ##");
		System.out.println("=======================");
		System.out.println("�й�\t\t�̸�");
		System.out.println("=======================");
		for(Student s:sdata){
			System.out.printf("%d\t\t%s", s.getId(),s.getName());
			System.out.println();
		}
		System.out.println("=======================");
		System.out.print("[1]�����Է� [2]������ȸ [0]���� --->");
		int sel=sc.nextInt();
		
		switch(sel){
		case 1:
			scoreInput(); break;
		case 2:
			scoreView(); break;
		case 0:
			System.exit(0); break;
		default : System.out.println("�߸������߽��ϴ�.");
		}
	}
	
	public static void main(String[] args){
		ScoreManagement sm=new ScoreManagement();
		sm.genStudent();
		sm.prtStudent();
	}
}
