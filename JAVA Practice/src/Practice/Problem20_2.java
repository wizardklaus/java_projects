package Practice;
import java.util.*;
import java.math.*;

public class Problem20_2 {
	public static void main(String[] args)
	{
	System.out.println("�� ���� ������ �Է����ּ���.");
	Scanner sc=new Scanner(System.in);
	BigDecimal a=new BigDecimal(sc.nextDouble());
	BigDecimal b=new BigDecimal(sc.nextDouble());
	BigDecimal minus=a.subtract(b);
	/*if (minus<0)
		minus=minus*-1;
		*/
	System.out.println("�� ���� ���� ���밪�� = "+minus.abs()+" �̴�.");
	}
}