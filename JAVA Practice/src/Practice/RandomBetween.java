package Practice;
import java.util.*;

class RandomBetween {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�ִ� : ");
		int max=sc.nextInt();
		
		System.out.println("�ּ� : ");
		int min=sc.nextInt();
		
		Random rand=new Random();
		
		int randVal;
		for(int i=0; i<10; i++)
		{
			randVal=rand.nextInt(max-min+1);
			randVal+=min;
			System.out.println(randVal);
		}
	}
}
