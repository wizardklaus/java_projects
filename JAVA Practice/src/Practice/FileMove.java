package Practice;
import java.io.File;

public class FileMove {
	public static void main(String[] args){
		File myFile=new File("D:/workspace/Basic2/src/klaus/klaus.bin");
		if(myFile.exists()==false){
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ��ϴ�.");
			return;
		}
		
		File reDir=new File("D://Basic2/src/Wizard");
		reDir.mkdir();
		File reFile=new File(reDir,"my.bin");
		myFile.renameTo(reFile);
		if(reFile.exists()==true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
	}
}
