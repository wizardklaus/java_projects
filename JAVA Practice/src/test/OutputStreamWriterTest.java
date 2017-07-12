package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
	public static void main(String[] args) {
		String path="D:/tempfile.txt";
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			for(int i='A';i<='Z';i++){
				bw.write(i);
			}
			br.close();
			bw.close();
			System.out.println("Done..");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
