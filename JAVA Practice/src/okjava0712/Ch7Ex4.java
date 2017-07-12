package okjava0712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch7Ex4 {

	public static void main(String[] args) {
		System.out.println("간단한 메모장");
		System.out.println("저장할 파일명 : ");
		Scanner scanner=new Scanner(System.in);
		String filename=scanner.next();
		System.out.println("저장은 마지막 라인에 q 입력");
		
		try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer=new BufferedWriter(new FileWriter("c:/Temp/"+filename+".txt"));
			
			String s;
			while((s=reader.readLine()).equals("q")){
				writer.write(s);
			}
			reader.close();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Done...");
	}
}
