package Practice;
import java.io.*;

public class ByteBufferedFileCopy {
	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("../Basic2/src/klaus.txt");
		OutputStream out=new FileOutputStream("../Basic2/src/klausout.txt");
		
		BufferedInputStream bin=new BufferedInputStream(in);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int copyByte=0;
		int bData;
		
		while(true){
			bData=bin.read();
			if(bData==-1)
				break;
			
			bout.write(bData);
			copyByte++;
		}
		
		bin.close();
		bout.close();
		System.out.println("복사된 바이트 크기 "+copyByte);
	}
}
