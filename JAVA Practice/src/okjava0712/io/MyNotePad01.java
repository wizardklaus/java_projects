package okjava0712.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyNotePad01 {
	public MyNotePad01(){
		Scanner sc=new Scanner(System.in);
		System.out.println("���ϸ��� �Է����ּ���. : ");
		String fname=sc.next();
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/"+fname+".txt"));
			
			String data=null;
			System.out.println("������ �Է�(q�� �Է��ϸ� ����) : ");
			while(!(data=br.readLine()).equals("q")){
				bw.write(data);
				bw.newLine();
				System.out.println("������ �Է�(q�� �Է��ϸ� ����) : ");
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
		finally{
			try{
				br.close();
				bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		MyNotePad01 app=new MyNotePad01();
	}
}
