package okjava0706;

public class ArrayTest {
	int[][] scores={
			{88,98,99,75,93},
			{100,90,89,75,93},
			{90,80,79,75,93},
			{88,90,94,65,93},
			{88,90,94,65,93}
	};
	
	public void start(){
		int total=0;
		for(int[] s : scores){
			for(int j=0;j<s.length;j++){
				total=total+s[j];
			}
			System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %d",total,total/scores.length);
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		ArrayTest app=new ArrayTest();
		app.start();
	}
}
