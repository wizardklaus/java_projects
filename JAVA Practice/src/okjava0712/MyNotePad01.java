package okjava0712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyNotePad01 {
	public MyNotePad01(){
		Scanner sc=new Scanner(System.in);
		System.out.println("파일명을 입력해주세요. : ");
		String fname=sc.next();
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/"+fname+".txt"));
			
			String data=null;
			System.out.println("내용을 입력(q를 입력하면 종료) : ");
			while(!(data=br.readLine()).equals("q")){
				bw.write(data);
				bw.newLine();
				System.out.println("내용을 입력(q를 입력하면 종료) : ");
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
