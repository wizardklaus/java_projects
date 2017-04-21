package Practice;
import java.io.*;

class Circle implements Serializable {
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int x, int y, double r){
		xPos=x;
		yPos=y;
		rad=r;
	}
	public void showCircleInfo(){
		System.out.printf("[%d,%d] \n",xPos,yPos);
		System.out.println("rad : "+rad);
	}
}

class ObjectSerializable{
	public static void main(String[] args) throws
	IOException,ClassNotFoundException{
		/* 인스턴스 저장 */
		ObjectOutputStream out=
				new ObjectOutputStream(new FileOutputStream("../Basic2/src/klaus.txt"));
		
		out.writeObject(new Circle(1,1,2.4));
		out.writeObject(new Circle(2,2,4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		/* 인스턴스 복원*/
		ObjectInputStream in=
				new ObjectInputStream(new FileInputStream("../Basic2/src/klaus.txt"));
		Circle cl1=(Circle)in.readObject();
		Circle cl2=(Circle)in.readObject();
		String message=(String)in.readObject();
		in.close();
		
		/* 복원된 정보 출력*/
		cl1.showCircleInfo();
		cl2.showCircleInfo();
		System.out.println(message);
	}
}