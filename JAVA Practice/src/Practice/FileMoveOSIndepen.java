package Practice;
import java.io.File;

public class FileMoveOSIndepen {
	public static void main(String[] args){
		File myFile=new File("D:"+File.separator+"workspace"+File.separator
				+"Basic2"+"src"+"klaus"+"klaus.bin");
		if(myFile.exists()==false){
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ��ϴ�.");
			return;
		}
		
		File reDir=new File("D:"+File.separator+"Basic2"+File.separator+"src"
		+File.separator+"Wizard");
		reDir.mkdir();
		File reFile=new File(reDir,"my.bin");
		myFile.renameTo(reFile);
		if(reFile.exists()==true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
	}
}
