package Practice;
import java.io.*;

public class ListFileDirectoryInfo {
	public static void main(String[] args){
		File myDir=new File("Basic2"+File.separator+"src"+File.separator+"klaus");
		File[] list=myDir.listFiles();
		
		for(int i=0; i<list.length; i++){
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
	}
}
