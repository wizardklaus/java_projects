package Practice;
import java.util.*;
import java.math.*;

public class Problem20_2 {
	public static void main(String[] args)
	{
	System.out.println("두 개의 정수를 입력해주세요.");
	Scanner sc=new Scanner(System.in);
	BigDecimal a=new BigDecimal(sc.nextDouble());
	BigDecimal b=new BigDecimal(sc.nextDouble());
	BigDecimal minus=a.subtract(b);
	/*if (minus<0)
		minus=minus*-1;
		*/
	System.out.println("두 수의 차의 절대값은 = "+minus.abs()+" 이다.");
	}
}