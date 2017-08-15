package okjava0712.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch7Ex4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("txt파일 생성 프로그램");
		System.out.println("만들파일 이름 :");
		String filename=scanner.next();
		
		try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer=new BufferedWriter(new FileWriter("d:/"+filename+".txt"));
			
			String s;
			System.out.println("내용입력 : ");
			while(!((s=reader.readLine()).equals("q"))){
				System.out.println("내용 :"+s);
				writer.write(s);
				writer.newLine();
				System.out.println("내용입력 : ");
			}
			reader.close();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Done...");
	}
}
