package okjava0712;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ch7Ex3 {

	public static void main(String[] args) {
		String path="C:/Temp/tempfile.txt";
		File file=new File(path);
		
		try{
			FileWriter fw=new FileWriter(file);
			for(int i='A';i<='Z';i++){
				fw.write(i);
			}
			fw.close();
			System.out.println("Done..");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
